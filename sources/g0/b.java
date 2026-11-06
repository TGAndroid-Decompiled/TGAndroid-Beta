package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import c8.ob;
import e0.j0;
import f0.g;
import java.util.Arrays;
public final class b {
    public final c f13395a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        j0[] j0VarArr;
        String string;
        ?? obj = new Object();
        this.f13395a = obj;
        obj.f13396a = context;
        obj.f13397b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.f13398c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.f13399e = shortcutInfo.getShortLabel();
        obj.f13400f = shortcutInfo.getLongLabel();
        obj.f13401g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.f13403j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        g gVar = null;
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i7 = extras.getInt("extraPersonCount");
            j0VarArr = new j0[i7];
            int i10 = 0;
            while (i10 < i7) {
                StringBuilder sb2 = new StringBuilder("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb2.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z9 = persistableBundle.getBoolean("isBot");
                boolean z10 = persistableBundle.getBoolean("isImportant");
                ?? obj2 = new Object();
                obj2.f10077a = string2;
                obj2.f10078b = null;
                obj2.f10079c = string3;
                obj2.d = string4;
                obj2.f10080e = z9;
                obj2.f10081f = z10;
                j0VarArr[i10] = obj2;
                i10 = i11;
            }
        } else {
            j0VarArr = 0;
        }
        obj.f13402i = j0VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        c cVar = this.f13395a;
        if (i12 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                ob.a(locusId, "locusId cannot be null");
                String id2 = locusId.getId();
                if (!TextUtils.isEmpty(id2)) {
                    gVar = new g(id2);
                } else {
                    throw new IllegalArgumentException("id cannot be empty");
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                gVar = new g(string);
            }
        }
        cVar.f13404k = gVar;
        this.f13395a.f13406m = shortcutInfo.getRank();
        this.f13395a.f13407n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f13395a;
        if (!TextUtils.isEmpty(cVar.f13399e)) {
            Intent[] intentArr = cVar.f13398c;
            if (intentArr != null && intentArr.length != 0) {
                return cVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
