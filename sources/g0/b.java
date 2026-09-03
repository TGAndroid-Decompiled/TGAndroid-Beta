package g0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import e0.o0;
import f0.i;
import java.util.Arrays;
import k7.j6;
public final class b {
    public final c f6332a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        o0[] o0VarArr;
        String string;
        ?? obj = new Object();
        this.f6332a = obj;
        obj.f6333a = context;
        obj.f6334b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        obj.f6335c = (Intent[]) Arrays.copyOf(intents, intents.length);
        obj.d = shortcutInfo.getActivity();
        obj.e = shortcutInfo.getShortLabel();
        obj.f6336f = shortcutInfo.getLongLabel();
        obj.f6337g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        obj.f6339j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        i iVar = null;
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
                obj2.f5012a = string2;
                obj2.f5013b = null;
                obj2.f5014c = string3;
                obj2.d = string4;
                obj2.e = z4;
                obj2.f5015f = z10;
                o0VarArr[i11] = obj2;
                i11 = i12;
            }
        } else {
            o0VarArr = 0;
        }
        obj.f6338i = o0VarArr;
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
        c cVar = this.f6332a;
        if (i13 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                j6.a(locusId, "locusId cannot be null");
                String id2 = locusId.getId();
                if (!TextUtils.isEmpty(id2)) {
                    iVar = new i(id2);
                } else {
                    throw new IllegalArgumentException("id cannot be empty");
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                iVar = new i(string);
            }
        }
        cVar.f6340k = iVar;
        this.f6332a.f6342m = shortcutInfo.getRank();
        this.f6332a.f6343n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f6332a;
        if (!TextUtils.isEmpty(cVar.e)) {
            Intent[] intentArr = cVar.f6335c;
            if (intentArr != null && intentArr.length != 0) {
                return cVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
