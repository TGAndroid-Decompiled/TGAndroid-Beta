package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.s1;
import e0.k0;
import f0.g;
import java.util.Arrays;
public final class b {
    public final c f11780a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        k0[] k0VarArr;
        String string;
        ?? obj = new Object();
        this.f11780a = obj;
        obj.f11781a = context;
        obj.f11782b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.f11783c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.f11784e = shortcutInfo.getShortLabel();
        obj.f11785f = shortcutInfo.getLongLabel();
        obj.f11786g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.f11788j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        g gVar = null;
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i3 = extras.getInt("extraPersonCount");
            k0VarArr = new k0[i3];
            int i10 = 0;
            while (i10 < i3) {
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
                obj2.f9264a = string2;
                obj2.f9265b = null;
                obj2.f9266c = string3;
                obj2.d = string4;
                obj2.f9267e = z10;
                obj2.f9268f = z11;
                k0VarArr[i10] = obj2;
                i10 = i11;
            }
        } else {
            k0VarArr = 0;
        }
        obj.f11787i = k0VarArr;
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
        c cVar = this.f11780a;
        if (i12 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                s1.a(locusId, "locusId cannot be null");
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
        cVar.f11789k = gVar;
        this.f11780a.f11791m = shortcutInfo.getRank();
        this.f11780a.f11792n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f11780a;
        if (!TextUtils.isEmpty(cVar.f11784e)) {
            Intent[] intentArr = cVar.f11783c;
            if (intentArr != null && intentArr.length != 0) {
                return cVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
