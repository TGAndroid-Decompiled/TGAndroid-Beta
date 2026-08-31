package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import e0.o0;
import f0.h;
import java.util.Arrays;
import k7.k6;
public final class b {
    public final c f6806a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        o0[] o0VarArr;
        String string;
        ?? obj = new Object();
        this.f6806a = obj;
        obj.f6807a = context;
        obj.f6808b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.f6809c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.f6810e = shortcutInfo.getShortLabel();
        obj.f6811f = shortcutInfo.getLongLabel();
        obj.f6812g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.f6814j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        h hVar = null;
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i10 = extras.getInt("extraPersonCount");
            o0VarArr = new o0[i10];
            int i11 = 0;
            while (i11 < i10) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i12 = i11 + 1;
                sb.append(i12);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z4 = persistableBundle.getBoolean("isBot");
                boolean z10 = persistableBundle.getBoolean("isImportant");
                ?? obj2 = new Object();
                obj2.f4835a = string2;
                obj2.f4836b = null;
                obj2.f4837c = string3;
                obj2.d = string4;
                obj2.f4838e = z4;
                obj2.f4839f = z10;
                o0VarArr[i11] = obj2;
                i11 = i12;
            }
        } else {
            o0VarArr = 0;
        }
        obj.f6813i = o0VarArr;
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
        c cVar = this.f6806a;
        if (i13 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                k6.a(locusId, "locusId cannot be null");
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
        cVar.f6815k = hVar;
        this.f6806a.f6817m = shortcutInfo.getRank();
        this.f6806a.f6818n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f6806a;
        if (!TextUtils.isEmpty(cVar.f6810e)) {
            Intent[] intentArr = cVar.f6809c;
            if (intentArr != null && intentArr.length != 0) {
                return cVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
