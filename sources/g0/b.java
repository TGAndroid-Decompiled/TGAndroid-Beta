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
import h7.m6;
import java.util.Arrays;

public final class b {

    public final c f6330a;

    public b(Context context, ShortcutInfo shortcutInfo) {
        p0[] p0VarArr;
        String string;
        c cVar = new c();
        this.f6330a = cVar;
        cVar.f6331a = context;
        cVar.f6332b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        cVar.f6333c = (Intent[]) Arrays.copyOf(intents, intents.length);
        cVar.d = shortcutInfo.getActivity();
        cVar.f6334e = shortcutInfo.getShortLabel();
        cVar.f6335f = shortcutInfo.getLongLabel();
        cVar.f6336g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        cVar.f6338j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        h hVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            p0VarArr = null;
        } else {
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
                p0 p0Var = new p0();
                p0Var.f5106a = string2;
                p0Var.f5107b = null;
                p0Var.f5108c = string3;
                p0Var.d = string4;
                p0Var.f5109e = z10;
                p0Var.f5110f = z11;
                p0VarArr[i11] = p0Var;
                i11 = i12;
            }
        }
        cVar.f6337i = p0VarArr;
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
        c cVar2 = this.f6330a;
        if (i13 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                hVar = new h(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            m6.a(locusId, "locusId cannot be null");
            String id2 = locusId.getId();
            if (TextUtils.isEmpty(id2)) {
                throw new IllegalArgumentException("id cannot be empty");
            }
            hVar = new h(id2);
        }
        cVar2.f6339k = hVar;
        this.f6330a.f6341m = shortcutInfo.getRank();
        this.f6330a.f6342n = shortcutInfo.getExtras();
    }

    public final c a() {
        c cVar = this.f6330a;
        if (TextUtils.isEmpty(cVar.f6334e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = cVar.f6333c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return cVar;
    }
}
