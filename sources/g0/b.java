package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import e0.p0;
import f0.h;
import java.util.Arrays;
import w7.o6;
public final class b {
    public final c f9329a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        p0[] p0VarArr;
        String string;
        ?? obj = new Object();
        this.f9329a = obj;
        obj.f9330a = context;
        obj.f9331b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.f9332c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.e = shortcutInfo.getShortLabel();
        obj.f9333f = shortcutInfo.getLongLabel();
        obj.f9334g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.f9336j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        h hVar = null;
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i10 = extras.getInt("extraPersonCount");
            p0VarArr = new p0[i10];
            int i11 = 0;
            while (i11 < i10) {
                StringBuilder sb2 = new StringBuilder("extraPerson_");
                int i12 = i11 + 1;
                sb2.append(i12);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb2.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z10 = persistableBundle.getBoolean("isBot");
                boolean z11 = persistableBundle.getBoolean("isImportant");
                ?? obj2 = new Object();
                obj2.f7823a = string2;
                obj2.f7824b = null;
                obj2.f7825c = string3;
                obj2.d = string4;
                obj2.e = z10;
                obj2.f7826f = z11;
                p0VarArr[i11] = obj2;
                i11 = i12;
            }
        } else {
            p0VarArr = 0;
        }
        obj.f9335i = p0VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        c cVar = this.f9329a;
        if (i13 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                o6.a(locusId, "locusId cannot be null");
                String id2 = locusId.getId();
                if (!TextUtils.isEmpty(id2)) {
                    hVar = new h(id2);
                } else {
                    throw new IllegalArgumentException("id cannot be empty");
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                hVar = new h(string);
            }
        }
        cVar.f9337k = hVar;
        this.f9329a.f9339m = shortcutInfo.getRank();
        this.f9329a.f9340n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f9329a;
        if (!TextUtils.isEmpty(cVar.e)) {
            Intent[] intentArr = cVar.f9332c;
            if (intentArr != null && intentArr.length != 0) {
                return cVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
