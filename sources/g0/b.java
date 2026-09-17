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
import w7.k6;
public final class b {
    public final c f10300a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        p0[] p0VarArr;
        String string;
        ?? obj = new Object();
        this.f10300a = obj;
        obj.f10301a = context;
        obj.f10302b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.f10303c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.f10304e = shortcutInfo.getShortLabel();
        obj.f10305f = shortcutInfo.getLongLabel();
        obj.f10306g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.f10308j = shortcutInfo.getCategories();
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
                obj2.f8695a = string2;
                obj2.f8696b = null;
                obj2.f8697c = string3;
                obj2.d = string4;
                obj2.f8698e = z10;
                obj2.f8699f = z11;
                p0VarArr[i11] = obj2;
                i11 = i12;
            }
        } else {
            p0VarArr = 0;
        }
        obj.f10307i = p0VarArr;
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
        c cVar = this.f10300a;
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
        cVar.f10309k = hVar;
        this.f10300a.f10311m = shortcutInfo.getRank();
        this.f10300a.f10312n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f10300a;
        if (!TextUtils.isEmpty(cVar.f10304e)) {
            Intent[] intentArr = cVar.f10303c;
            if (intentArr != null && intentArr.length != 0) {
                return cVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
