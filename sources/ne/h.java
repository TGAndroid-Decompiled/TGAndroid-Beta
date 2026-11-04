package ne;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import g2.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.lt;
import org.telegram.ui.rw;
import r4.n;
import r4.s0;
import r4.v;
import r4.y;
public final class h {
    public boolean f20352a;
    public final Object f20353b;
    public final Object f20354c;
    public final Object d;
    public final Object f20355e;
    public Object f20356f;
    public Object f20357g;
    public Object h;

    public h(ba.i composer, me.b bVar, j jVar, h[] hVarArr) {
        kotlin.jvm.internal.j.e(composer, "composer");
        this.f20353b = composer;
        this.f20354c = bVar;
        this.d = jVar;
        this.f20355e = hVarArr;
        this.f20356f = bVar.f19277a;
        int ordinal = jVar.ordinal();
        if (hVarArr != null) {
            h hVar = hVarArr[ordinal];
            if (hVar == null && hVar == this) {
                return;
            }
            hVarArr[ordinal] = this;
        }
    }

    public h a(je.d descriptor) {
        h hVar;
        h[] hVarArr = (h[]) this.f20355e;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        me.b bVar = (me.b) this.f20354c;
        j f10 = f.f(descriptor, bVar);
        char c2 = f10.f20364a;
        ba.i iVar = (ba.i) this.f20353b;
        iVar.j(c2);
        iVar.f3186b = true;
        String str = (String) this.f20357g;
        if (str != null) {
            String str2 = (String) this.h;
            if (str2 == null) {
                str2 = descriptor.a();
            }
            iVar.i();
            j(str);
            iVar.j(':');
            j(str2);
            this.f20357g = null;
            this.h = null;
        }
        if (((j) this.d) == f10) {
            return this;
        }
        if (hVarArr != null && (hVar = hVarArr[f10.ordinal()]) != null) {
            return hVar;
        }
        return new h(iVar, bVar, f10, hVarArr);
    }

    public void b(je.d descriptor, int i3) {
        ba.i iVar = (ba.i) this.f20353b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        int ordinal = ((j) this.d).ordinal();
        boolean z10 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!iVar.f3186b) {
                        iVar.j(',');
                    }
                    iVar.i();
                    f.e(descriptor, (me.b) this.f20354c);
                    j(descriptor.g(i3));
                    iVar.j(':');
                    iVar.k();
                    return;
                }
                if (i3 == 0) {
                    this.f20352a = true;
                }
                if (i3 == 1) {
                    iVar.j(',');
                    iVar.k();
                    this.f20352a = false;
                    return;
                }
                return;
            } else if (!iVar.f3186b) {
                if (i3 % 2 == 0) {
                    iVar.j(',');
                    iVar.i();
                } else {
                    iVar.j(':');
                    iVar.k();
                    z10 = false;
                }
                this.f20352a = z10;
                return;
            } else {
                this.f20352a = true;
                iVar.i();
                return;
            }
        }
        if (!iVar.f3186b) {
            iVar.j(',');
        }
        iVar.i();
    }

    public void c(int i3) {
        if (this.f20352a) {
            j(String.valueOf(i3));
        } else {
            ((jc.a) ((ba.i) this.f20353b).f3187c).c(String.valueOf(i3));
        }
    }

    public void d(long j10) {
        if (this.f20352a) {
            j(String.valueOf(j10));
        } else {
            ((jc.a) ((ba.i) this.f20353b).f3187c).c(String.valueOf(j10));
        }
    }

    public void e(je.d descriptor, int i3, long j10) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        b(descriptor, i3);
        d(j10);
    }

    public void f() {
        ba.i iVar = (ba.i) this.f20353b;
        iVar.getClass();
        kotlin.jvm.internal.j.e("null", "v");
        ((jc.a) iVar.f3187c).c("null");
    }

    public void g(je.d descriptor, int i3, he.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        if (obj == null && !((q0) this.f20356f).f11893b) {
            return;
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        b(descriptor, i3);
        if (serializer.d().c()) {
            i(serializer, obj);
        } else if (obj == null) {
            f();
        } else {
            i(serializer, obj);
        }
    }

    public void h(je.d descriptor, int i3, he.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        b(descriptor, i3);
        i(serializer, obj);
    }

    public void i(he.a r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ne.h.i(he.a, java.lang.Object):void");
    }

    public void j(String value) {
        int i3;
        kotlin.jvm.internal.j.e(value, "value");
        ba.i iVar = (ba.i) this.f20353b;
        iVar.getClass();
        kotlin.jvm.internal.j.e(value, "value");
        jc.a aVar = (jc.a) iVar.f3187c;
        aVar.a(aVar.f16237c, value.length() + 2);
        char[] cArr = aVar.f16236b;
        int i10 = aVar.f16237c;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c2 = cArr[i13];
            byte[] bArr = i.f20359b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    aVar.a(i13, 2);
                    char charAt = value.charAt(i14);
                    byte[] bArr2 = i.f20359b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i3 = i13 + 1;
                            aVar.f16236b[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str = i.f20358a[charAt];
                                kotlin.jvm.internal.j.b(str);
                                aVar.a(i13, str.length());
                                str.getChars(0, str.length(), aVar.f16236b, i13);
                                int length3 = str.length() + i13;
                                aVar.f16237c = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = aVar.f16236b;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                aVar.f16237c = i13;
                            }
                        }
                    } else {
                        i3 = i13 + 1;
                        aVar.f16236b[i13] = charAt;
                    }
                    i13 = i3;
                }
                aVar.a(i13, 1);
                aVar.f16236b[i13] = '\"';
                aVar.f16237c = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        aVar.f16237c = i12 + 1;
    }

    public void k(je.d descriptor, int i3, String value) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(value, "value");
        b(descriptor, i3);
        j(value);
    }

    public void l(je.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ba.i iVar = (ba.i) this.f20353b;
        iVar.getClass();
        iVar.f3186b = false;
        iVar.j(((j) this.d).f20365b);
    }

    public FileInputStream m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                ((t4.d) this.f20354c).r();
                return null;
            }
            return null;
        }
    }

    public void n(int i3, Serializable serializable) {
        ((Executor) this.f20353b).execute(new rw(this, i3, serializable, 24));
    }

    public void o() {
        boolean f10;
        int i3;
        r4.e eVar = (r4.e) this.f20354c;
        PackageManager packageManager = (PackageManager) this.f20355e;
        ArrayList arrayList = (ArrayList) this.f20356f;
        if (this.f20352a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                    arrayList3.add(resolveInfo.serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (y.f54392c == null) {
                        f10 = false;
                    } else {
                        f10 = y.c().f();
                    }
                    if (f10 && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            ComponentName componentName = ((s0) arrayList.get(i12)).f54355r;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 < 0) {
                        s0 s0Var = new s0((Context) this.f20353b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        s0Var.G = new e3(this, s0Var);
                        if (!s0Var.f54358x) {
                            s0Var.f54358x = true;
                            s0Var.r();
                        }
                        i3 = i10 + 1;
                        arrayList.add(i10, s0Var);
                        eVar.a(s0Var, false);
                    } else if (i12 >= i10) {
                        s0 s0Var2 = (s0) arrayList.get(i12);
                        if (!s0Var2.f54358x) {
                            s0Var2.f54358x = true;
                            s0Var2.r();
                        }
                        if (s0Var2.E == null) {
                            if (!s0Var2.f54358x || (((n) s0Var2.h) == null && s0Var2.f54357w.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                s0Var2.q();
                                s0Var2.n();
                            }
                        }
                        i3 = i10 + 1;
                        Collections.swap(arrayList, i12, i10);
                    }
                    i10 = i3;
                }
            }
            if (i10 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i10; size3--) {
                    s0 s0Var3 = (s0) arrayList.get(size3);
                    v d = eVar.d(s0Var3);
                    if (d != null) {
                        s0Var3.getClass();
                        y.b();
                        s0Var3.f7592f = null;
                        s0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f54257a.b(514, d);
                        eVar.f54266l.remove(d);
                    }
                    arrayList.remove(s0Var3);
                    s0Var3.G = null;
                    if (s0Var3.f54358x) {
                        s0Var3.f54358x = false;
                        s0Var3.r();
                    }
                }
            }
        }
    }

    public boolean p(je.d dVar) {
        ((q0) this.f20356f).getClass();
        return false;
    }

    public h(Context context, r4.e eVar) {
        this.f20356f = new ArrayList();
        this.f20357g = new androidx.mediarouter.app.f(this, 12);
        this.h = new lt(this, 22);
        this.f20353b = context;
        this.f20354c = eVar;
        this.d = new Handler();
        this.f20355e = context.getPackageManager();
    }

    public h(AssetManager assetManager, Executor executor, t4.d dVar, String str, File file) {
        this.f20352a = false;
        this.f20353b = executor;
        this.f20354c = dVar;
        this.f20357g = str;
        this.f20355e = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 >= 24 && i3 <= 34) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = t4.e.h;
                    break;
                case 26:
                    bArr = t4.e.f54920g;
                    break;
                case 27:
                    bArr = t4.e.f54919f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = t4.e.f54918e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = t4.e.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
