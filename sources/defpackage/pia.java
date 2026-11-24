package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
public final class pia {
    public final qia a;

    public pia(Context context, ShortcutInfo shortcutInfo) {
        n58[] n58VarArr;
        String string;
        ?? obj = new Object();
        this.a = obj;
        obj.a = context;
        obj.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.e = shortcutInfo.getShortLabel();
        obj.f = shortcutInfo.getLongLabel();
        obj.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        td6 td6Var = null;
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i = extras.getInt("extraPersonCount");
            n58VarArr = new n58[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z = persistableBundle.getBoolean("isBot");
                boolean z2 = persistableBundle.getBoolean("isImportant");
                ?? obj2 = new Object();
                obj2.a = string2;
                obj2.b = null;
                obj2.c = string3;
                obj2.d = string4;
                obj2.e = z;
                obj2.f = z2;
                n58VarArr[i2] = obj2;
                i2 = i3;
            }
        } else {
            n58VarArr = 0;
        }
        obj.i = n58VarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        qia qiaVar = this.a;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                nte.a(locusId, "locusId cannot be null");
                String id = locusId.getId();
                if (!TextUtils.isEmpty(id)) {
                    td6Var = new td6(id);
                } else {
                    u36.j("id cannot be empty");
                    throw null;
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                td6Var = new td6(string);
            }
        }
        qiaVar.k = td6Var;
        this.a.m = shortcutInfo.getRank();
        this.a.n = shortcutInfo.getExtras();
    }

    public final qia a() {
        qia qiaVar = this.a;
        if (!TextUtils.isEmpty(qiaVar.e)) {
            Intent[] intentArr = qiaVar.c;
            if (intentArr != null && intentArr.length != 0) {
                return qiaVar;
            }
            u36.j("Shortcut must have an intent");
            return null;
        }
        u36.j("Shortcut must have a non-empty label");
        return null;
    }
}
