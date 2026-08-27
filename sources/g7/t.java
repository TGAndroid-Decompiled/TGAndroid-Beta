package g7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public abstract class t {
    public static androidx.emoji2.text.q a(Context context) {
        ProviderInfo providerInfo;
        o0.e eVar;
        ApplicationInfo applicationInfo;
        w9.d cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(1) : new w9.d(1);
        PackageManager packageManager = context.getPackageManager();
        h7.m6.a(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrN3 = cVar.n3(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrN3) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new o0.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e9) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e9);
                eVar = null;
            }
        }
        if (eVar == null) {
            return null;
        }
        return new androidx.emoji2.text.q(new androidx.emoji2.text.p(context, eVar));
    }
}
