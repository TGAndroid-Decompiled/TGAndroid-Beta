package h2;

import a9.o;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.l;
import com.google.android.gms.common.api.internal.q1;
import e0.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class e implements Runnable {

    public final int f7756a;

    public final ArrayList f7757b;

    public final l f7758c;
    public final ShortcutInfoCompatSaverImpl d;

    public e(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, l lVar, int i10) {
        this.f7756a = i10;
        this.d = shortcutInfoCompatSaverImpl;
        this.f7757b = arrayList;
        this.f7758c = lVar;
    }

    @Override
    public final void run() {
        String resourceName;
        String absolutePath;
        switch (this.f7756a) {
            case 0:
                ArrayList arrayList = this.f7757b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.d;
                    if (i10 >= size) {
                        shortcutInfoCompatSaverImpl.h(this.f7758c);
                        return;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    shortcutInfoCompatSaverImpl.f1872b.remove(str);
                    s8.a aVar = (s8.a) shortcutInfoCompatSaverImpl.f1873c.remove(str);
                    if (aVar != null) {
                        aVar.cancel(false);
                    }
                }
                break;
            default:
                ArrayList arrayList2 = this.f7757b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = this.d;
                    if (i11 >= size2) {
                        shortcutInfoCompatSaverImpl2.h(this.f7758c);
                        return;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    g0.c cVar = (g0.c) obj2;
                    Set set = cVar.f6338j;
                    if (set != null && !set.isEmpty()) {
                        IconCompat iconCompat = cVar.h;
                        if (iconCompat == null) {
                            resourceName = null;
                            absolutePath = null;
                        } else {
                            int i12 = iconCompat.i();
                            if (i12 == 1) {
                                absolutePath = new File(shortcutInfoCompatSaverImpl2.f1876g, UUID.randomUUID().toString()).getAbsolutePath();
                                resourceName = null;
                            } else if (i12 == 2) {
                                resourceName = shortcutInfoCompatSaverImpl2.f1871a.getResources().getResourceName(iconCompat.g());
                                absolutePath = null;
                            } else if (i12 != 5) {
                                resourceName = null;
                                absolutePath = null;
                            } else {
                                absolutePath = new File(shortcutInfoCompatSaverImpl2.f1876g, UUID.randomUUID().toString()).getAbsolutePath();
                                resourceName = null;
                            }
                        }
                        g0.c cVar2 = new g0.c();
                        cVar2.f6331a = cVar.f6331a;
                        cVar2.f6332b = cVar.f6332b;
                        Intent[] intentArr = cVar.f6333c;
                        cVar2.f6333c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        cVar2.d = cVar.d;
                        cVar2.f6334e = cVar.f6334e;
                        cVar2.f6335f = cVar.f6335f;
                        cVar2.f6336g = cVar.f6336g;
                        cVar2.h = cVar.h;
                        cVar2.f6339k = cVar.f6339k;
                        cVar2.f6340l = cVar.f6340l;
                        cVar2.f6341m = cVar.f6341m;
                        p0[] p0VarArr = cVar.f6337i;
                        if (p0VarArr != null) {
                            cVar2.f6337i = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
                        }
                        if (cVar.f6338j != null) {
                            cVar2.f6338j = new HashSet(cVar.f6338j);
                        }
                        PersistableBundle persistableBundle = cVar.f6342n;
                        if (persistableBundle != null) {
                            cVar2.f6342n = persistableBundle;
                        }
                        cVar2.h = null;
                        if (TextUtils.isEmpty(cVar2.f6334e)) {
                            throw new IllegalArgumentException("Shortcut must have a non-empty label");
                        }
                        Intent[] intentArr2 = cVar2.f6333c;
                        if (intentArr2 == null || intentArr2.length == 0) {
                            throw new IllegalArgumentException("Shortcut must have an intent");
                        }
                        f fVar = new f(cVar2, resourceName, absolutePath);
                        Bitmap bitmapF = absolutePath != null ? cVar.h.f() : null;
                        String str2 = cVar.f6332b;
                        shortcutInfoCompatSaverImpl2.f1872b.put(str2, fVar);
                        if (bitmapF != null) {
                            q1 q1Var = new q1(shortcutInfoCompatSaverImpl2, bitmapF, absolutePath, 3);
                            l lVar = new l();
                            shortcutInfoCompatSaverImpl2.f1874e.submit(new o(12, lVar, q1Var));
                            s8.a aVar2 = (s8.a) shortcutInfoCompatSaverImpl2.f1873c.put(str2, lVar);
                            if (aVar2 != null) {
                                aVar2.cancel(false);
                            }
                            lVar.c(new q1(this, str2, lVar), shortcutInfoCompatSaverImpl2.d);
                        }
                    }
                }
                break;
        }
    }
}
