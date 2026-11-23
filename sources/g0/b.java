package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import c8.ub;
import e0.j0;
import java.util.Arrays;
public final class b {
    public final c f13054a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        j0[] j0VarArr;
        String string;
        ?? obj = new Object();
        this.f13054a = obj;
        obj.f13055a = context;
        obj.f13056b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.f13057c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.f13058e = shortcutInfo.getShortLabel();
        obj.f13059f = shortcutInfo.getLongLabel();
        obj.f13060g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.f13062j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        f0.g gVar = null;
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
                boolean z10 = persistableBundle.getBoolean("isBot");
                boolean z11 = persistableBundle.getBoolean("isImportant");
                ?? obj2 = new Object();
                obj2.f10221a = string2;
                obj2.f10222b = null;
                obj2.f10223c = string3;
                obj2.d = string4;
                obj2.f10224e = z10;
                obj2.f10225f = z11;
                j0VarArr[i10] = obj2;
                i10 = i11;
            }
        } else {
            j0VarArr = 0;
        }
        obj.f13061i = j0VarArr;
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
        c cVar = this.f13054a;
        if (i12 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                ub.a(locusId, "locusId cannot be null");
                String id2 = locusId.getId();
                if (!TextUtils.isEmpty(id2)) {
                    gVar = new f0.g(id2);
                } else {
                    throw new IllegalArgumentException("id cannot be empty");
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                gVar = new f0.g(string);
            }
        }
        cVar.f13063k = gVar;
        this.f13054a.f13065m = shortcutInfo.getRank();
        this.f13054a.f13066n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f13054a;
        if (!TextUtils.isEmpty(cVar.f13058e)) {
            Intent[] intentArr = cVar.f13057c;
            if (intentArr != null && intentArr.length != 0) {
                return cVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
