package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.Wallet.c;
public final class s30 extends q59 {
    public final byte c;
    public final Object d;
    public final Object e;

    public s30(Context context) {
        this.c = (byte) 17;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        cg3 cg3Var = new cg3();
        cg3Var.a = jb6.M0(2131743856, null);
        cg3Var.b = jb6.M0(2131743848, null);
        cg3Var.c = (byte) 0;
        cg3Var.d = (byte) 0;
        cg3Var.e = true;
        cg3Var.f = false;
        cg3Var.g = (byte) 0;
        cg3Var.h = currentTimeMillis;
        cg3Var.i = false;
        cg3Var.j = false;
        cg3Var.k = 2;
        arrayList.add(cg3Var);
        cg3 cg3Var2 = new cg3();
        cg3Var2.a = jb6.M0(2131743855, null);
        cg3Var2.b = jb6.M0(2131743847, null);
        cg3Var2.c = (byte) 1;
        cg3Var2.d = (byte) 2;
        cg3Var2.e = false;
        cg3Var2.f = false;
        cg3Var2.g = (byte) 0;
        cg3Var2.h = currentTimeMillis - 3600;
        cg3Var2.i = false;
        cg3Var2.j = false;
        cg3Var2.k = -1;
        arrayList.add(cg3Var2);
        cg3 cg3Var3 = new cg3();
        cg3Var3.a = jb6.M0(2131743854, null);
        cg3Var3.b = jb6.M0(2131743846, null);
        cg3Var3.c = (byte) 2;
        cg3Var3.d = (byte) 3;
        cg3Var3.e = false;
        cg3Var3.f = true;
        cg3Var3.g = (byte) 0;
        cg3Var3.h = currentTimeMillis - 7200;
        cg3Var3.i = false;
        cg3Var3.j = true;
        cg3Var3.k = -1;
        arrayList.add(cg3Var3);
        cg3 cg3Var4 = new cg3();
        cg3Var4.a = jb6.M0(2131743853, null);
        cg3Var4.b = jb6.M0(2131743845, null);
        cg3Var4.c = (byte) 3;
        cg3Var4.d = (byte) 0;
        cg3Var4.e = false;
        cg3Var4.f = false;
        cg3Var4.g = (byte) 2;
        cg3Var4.h = currentTimeMillis - 10800;
        cg3Var4.i = false;
        cg3Var4.j = false;
        cg3Var4.k = -1;
        arrayList.add(cg3Var4);
        cg3 cg3Var5 = new cg3();
        cg3Var5.a = jb6.M0(2131743852, null);
        cg3Var5.b = jb6.M0(2131743844, null);
        cg3Var5.c = (byte) 4;
        cg3Var5.d = (byte) 0;
        cg3Var5.e = false;
        cg3Var5.f = false;
        cg3Var5.g = (byte) 1;
        cg3Var5.h = currentTimeMillis - 14400;
        cg3Var5.i = false;
        cg3Var5.j = false;
        cg3Var5.k = 2;
        arrayList.add(cg3Var5);
        cg3 cg3Var6 = new cg3();
        cg3Var6.a = jb6.M0(2131743851, null);
        cg3Var6.b = jb6.M0(2131743843, null);
        cg3Var6.c = (byte) 5;
        cg3Var6.d = (byte) 0;
        cg3Var6.e = false;
        cg3Var6.f = false;
        cg3Var6.g = (byte) 0;
        cg3Var6.h = currentTimeMillis - 18000;
        cg3Var6.i = false;
        cg3Var6.j = false;
        cg3Var6.k = -1;
        arrayList.add(cg3Var6);
        cg3 cg3Var7 = new cg3();
        cg3Var7.a = jb6.M0(2131743850, null);
        cg3Var7.b = jb6.M0(2131743842, null);
        cg3Var7.c = (byte) 6;
        cg3Var7.d = (byte) 0;
        cg3Var7.e = false;
        cg3Var7.f = false;
        cg3Var7.g = (byte) 0;
        cg3Var7.h = currentTimeMillis - 21600;
        cg3Var7.i = true;
        cg3Var7.j = false;
        cg3Var7.k = -1;
        arrayList.add(cg3Var7);
        cg3 cg3Var8 = new cg3();
        cg3Var8.a = jb6.M0(2131743849, null);
        cg3Var8.b = jb6.M0(2131743841, null);
        cg3Var8.c = (byte) 0;
        cg3Var8.d = (byte) 0;
        cg3Var8.e = false;
        cg3Var8.f = false;
        cg3Var8.g = (byte) 0;
        cg3Var8.h = currentTimeMillis - 25200;
        cg3Var8.i = true;
        cg3Var8.j = false;
        cg3Var8.k = -1;
        arrayList.add(cg3Var8);
    }

    private final void G(defpackage.u69 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s30.G(u69, int):void");
    }

    private final void H(u69 u69Var, int i) {
        String a0;
        PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            nx7 nx7Var = (nx7) view;
                            nx7Var.a.f(2131624320, 100, 100, null);
                            nx7Var.a.d();
                            return;
                        }
                        return;
                    }
                    jf5 jf5Var = (jf5) view;
                    jf5Var.setHeight(46);
                    if (i == passcodeActivity.N) {
                        jf5Var.setText(jb6.M0(2131745577, null));
                        return;
                    } else if (i == passcodeActivity.J) {
                        jf5Var.setText(jb6.M0(2131742761, null));
                        return;
                    } else {
                        return;
                    }
                }
                njb njbVar = (njb) view;
                if (i == passcodeActivity.H) {
                    njbVar.setText(jb6.M0(2131747388, null));
                    njbVar.setBackground(null);
                    njbVar.getTextView().setGravity(1);
                    return;
                } else if (i == passcodeActivity.I) {
                    njbVar.setText(jb6.M0(2131753762, null));
                    l66 textView = njbVar.getTextView();
                    if (jb6.a0) {
                        i3 = 5;
                    }
                    textView.setGravity(i3);
                    return;
                } else if (i == passcodeActivity.M) {
                    njbVar.setText(jb6.M0(2131742760, null));
                    l66 textView2 = njbVar.getTextView();
                    if (jb6.a0) {
                        i3 = 5;
                    }
                    textView2.setGravity(i3);
                    return;
                } else if (i == passcodeActivity.P) {
                    njbVar.setText(jb6.M0(2131745576, null));
                    l66 textView3 = njbVar.getTextView();
                    if (jb6.a0) {
                        i3 = 5;
                    }
                    textView3.setGravity(i3);
                    return;
                } else {
                    return;
                }
            }
            vkb vkbVar = (vkb) view;
            if (i == PasscodeActivity.c0(passcodeActivity)) {
                vkbVar.b(jb6.M0(2131752497, null), true);
                if (gda.r.isEmpty()) {
                    int i4 = cmb.D6;
                    vkbVar.setTag(Integer.valueOf(i4));
                    anb.X(vkbVar.getTextView(), i4, null);
                    return;
                }
                int i5 = cmb.F6;
                vkbVar.setTag(Integer.valueOf(i5));
                anb.X(vkbVar.getTextView(), i5, null);
                return;
            } else if (i == PasscodeActivity.b0(passcodeActivity)) {
                int i6 = gda.x;
                if (i6 == 0) {
                    a0 = jb6.a0("AutoLockDisabled", null, 2131753764, new Object[0]);
                } else if (i6 < 3600) {
                    a0 = jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(i6 / 60, "Minutes", new Object[0]));
                } else if (i6 < 86400) {
                    a0 = jb6.a0("AutoLockInTime", null, 2131753763, jb6.G((int) Math.ceil((i6 / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else {
                    a0 = jb6.a0("AutoLockInTime", null, 2131753763, jb6.G((int) Math.ceil(((i6 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                }
                vkbVar.c(jb6.M0(2131753765, null), a0, false, true);
                int i7 = cmb.F6;
                vkbVar.setTag(Integer.valueOf(i7));
                anb.X(vkbVar.getTextView(), i7, null);
                return;
            } else if (i == PasscodeActivity.d0(passcodeActivity)) {
                vkbVar.b(jb6.M0(2131751370, null), false);
                int i8 = cmb.p7;
                vkbVar.setTag(Integer.valueOf(i8));
                anb.X(vkbVar.getTextView(), i8, null);
                return;
            } else {
                return;
            }
        }
        bjb bjbVar = (bjb) view;
        if (i == PasscodeActivity.a0(passcodeActivity)) {
            bjbVar.f(jb6.M0(2131743560, null), gda.C, false);
        } else if (i == passcodeActivity.O) {
            bjbVar.f(jb6.M0(2131745575, null), gda.z, false);
        } else if (i == passcodeActivity.L) {
            String M0 = jb6.M0(2131742849, null);
            if (!c.C(PasscodeActivity.f0(passcodeActivity)).e() || !c.C(PasscodeActivity.g0(passcodeActivity)).Q()) {
                z = false;
            }
            bjbVar.f(M0, z, false);
        } else if (i == passcodeActivity.K) {
            bjbVar.f(jb6.M0(2131742848, null), c.C(PasscodeActivity.h0(passcodeActivity)).R(), false);
        }
    }

    private final void I(u69 u69Var, int i) {
        n78 n78Var = (n78) this.e;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                y68 y68Var = (y68) view;
                y68Var.setTag(Integer.valueOf(i));
                if (i == n78Var.E) {
                    y68Var.a(n78Var.O, jb6.M0(2131743799, null));
                    return;
                } else if (i == n78Var.F) {
                    y68Var.a(n78Var.P, jb6.M0(2131743800, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        z68 z68Var = (z68) view;
        z68Var.setTag(Integer.valueOf(i));
        if (i == n78Var.b) {
            z68Var.a(jb6.M0(2131751063, null), 0, n78Var.H);
        } else if (i == n78Var.r) {
            z68Var.a(jb6.M0(2131749059, null), -100, n78Var.Q);
        } else if (i == n78Var.d) {
            z68Var.a(jb6.M0(2131751706, null), -100, n78Var.J);
        } else if (i == n78Var.c) {
            z68Var.a(jb6.M0(2131750794, null), -100, n78Var.I);
        } else if (i == n78Var.f) {
            z68Var.a(jb6.M0(2131742612, null), -100, n78Var.K);
        } else if (i == n78Var.e) {
            z68Var.a(jb6.M0(2131745681, null), -100, n78Var.L);
        } else if (i == n78Var.w) {
            z68Var.a(jb6.M0(2131743208, null), 0, n78Var.S);
        } else if (i == n78Var.s) {
            z68Var.a(jb6.M0(2131745199, null), -100, n78Var.R);
        } else if (i == n78Var.x) {
            z68Var.a(jb6.M0(2131749298, null), 0, n78Var.T);
        } else if (i == n78Var.y) {
            z68Var.a(jb6.M0(2131745101, null), 0, n78Var.V);
        } else if (i == n78Var.h) {
            z68Var.a(jb6.M0(2131750783, null), 0, n78Var.M);
        } else if (i == n78Var.n) {
            z68Var.a(jb6.M0(2131745027, null), 0, n78Var.N);
        }
    }

    private final void J(u69 u69Var, int i) {
        boolean Q0;
        boolean z;
        w78 w78Var = (w78) this.e;
        yn6 yn6Var = w78Var.K;
        ArrayList arrayList = w78Var.n;
        ArrayList arrayList2 = w78Var.c;
        HashMap hashMap = w78Var.b;
        int i2 = u69Var.f;
        View view = u69Var.a;
        int i3 = -1;
        int i4 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        xib xibVar = (xib) view;
                        if (i < arrayList.size()) {
                            xibVar.o(2131232333, (CharSequence) arrayList.get(i), false);
                            return;
                        } else {
                            xibVar.o(2131232100, jb6.M0(2131752004, null), false);
                            return;
                        }
                    }
                    return;
                }
                jo6 jo6Var = (jo6) yn6Var.e.get(i);
                ida idaVar = (ida) view;
                idaVar.setPhotoEntry(jo6Var);
                idaVar.b(hashMap.containsKey(Integer.valueOf(jo6Var.C)), false);
                idaVar.setTag(Integer.valueOf(i));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = w78Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        q68 q68Var = (q68) view;
        q68Var.setItemSize(w78Var.S);
        bf0 imageView = q68Var.getImageView();
        q68Var.setTag(Integer.valueOf(i));
        imageView.q();
        if (yn6Var != null) {
            jo6 jo6Var2 = (jo6) yn6Var.e.get(i);
            if (arrayList2.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            q68Var.d(jo6Var2, z, true, false, false);
            int i5 = jo6Var2.C;
            if (w78Var.e) {
                i3 = arrayList2.indexOf(Integer.valueOf(i5));
            }
            q68Var.b(i3, hashMap.containsKey(Integer.valueOf(i5)), false);
            Q0 = PhotoViewer.Q0(jo6Var2.I);
        } else {
            no6 no6Var = (no6) w78Var.f.get(i);
            q68Var.e(no6Var);
            q68Var.getVideoInfoContainer().setVisibility(4);
            if (w78Var.e) {
                i3 = arrayList2.indexOf(no6Var.B);
            }
            q68Var.b(i3, hashMap.containsKey(no6Var.B), false);
            Q0 = PhotoViewer.Q0(no6Var.g());
        }
        imageView.getImageReceiver().v0(!Q0, true);
        q68Var.getCheckBox().setVisibility((w78Var.U != 0 || Q0) ? 8 : 8);
    }

    private final void K(u69 u69Var, int i) {
        int i2;
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        a88 a88Var = (a88) u69Var.a;
        int L = gm.L(85.0f);
        if (i != 0) {
            i2 = gm.L(6.0f);
        } else {
            i2 = 0;
        }
        a88Var.f = L;
        jh2 jh2Var = a88Var.c;
        bf0 bf0Var = a88Var.a;
        jp0 jp0Var = a88Var.e;
        a88Var.h = i2;
        ((FrameLayout.LayoutParams) a88Var.b.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) bf0Var.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) jp0Var.getLayoutParams()).rightMargin = i2;
        bf0Var.q();
        Object obj = photoViewer.d.u().get(photoViewer.d.d().get(i));
        if (obj instanceof jo6) {
            jo6 jo6Var = (jo6) obj;
            int i3 = jo6Var.C;
            String str = jo6Var.I;
            a88Var.setTag(jo6Var);
            jp0Var.setVisibility(4);
            String str2 = jo6Var.c;
            if (str2 != null) {
                bf0Var.o(str2, null, context.getResources().getDrawable(2131232467));
            } else if (str != null) {
                bf0Var.r(jo6Var.J, jo6Var.K, true);
                if (jo6Var.b && !jo6Var.d()) {
                    jp0Var.setVisibility(0);
                    a88Var.d.setText(gm.g0(jo6Var.E, false, false));
                    bf0Var.o("vthumb://" + i3 + ":" + str, null, context.getResources().getDrawable(2131232467));
                } else {
                    bf0Var.o(mle.d("thumb://", i3, ":", str), null, context.getResources().getDrawable(2131232467));
                }
            } else {
                bf0Var.setImageResource(2131232467);
            }
            jh2Var.a.f(-1, true, false);
            jh2Var.setVisibility(0);
        } else if (obj instanceof no6) {
            no6 no6Var = (no6) obj;
            a88Var.setTag(no6Var);
            a88Var.setImage(no6Var);
            jp0Var.setVisibility(4);
            jh2Var.a.f(-1, true, false);
            jh2Var.setVisibility(0);
        }
    }

    private final void L(u69 u69Var, int i) {
        boolean z;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z2 = true;
        switch (i2) {
            case 1:
                vkb vkbVar = (vkb) view;
                anb.X(vkbVar.getTextView(), cmb.F6, null);
                if (i == ProxyListActivity.d0(proxyListActivity)) {
                    String M0 = jb6.M0(2131754388, null);
                    if (proxyListActivity.E == -1) {
                        z2 = false;
                    }
                    vkbVar.b(M0, z2);
                    return;
                } else if (i == proxyListActivity.E) {
                    anb.X(vkbVar.getTextView(), cmb.o7, null);
                    vkbVar.b(jb6.M0(2131751517, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                jf5 jf5Var = (jf5) view;
                if (i == proxyListActivity.h) {
                    jf5Var.setText(jb6.M0(2131746338, null));
                    return;
                }
                return;
            case 3:
                bjb bjbVar = (bjb) view;
                if (i == ProxyListActivity.e0(proxyListActivity)) {
                    String M02 = jb6.M0(2131743470, null);
                    boolean z3 = proxyListActivity.d;
                    if (proxyListActivity.w == -1) {
                        z2 = false;
                    }
                    bjbVar.f(M02, z3, z2);
                    return;
                } else if (i == proxyListActivity.w) {
                    bjbVar.f(jb6.M0(2131743472, null), gda.W0, true);
                    return;
                } else {
                    return;
                }
            case 4:
                njb njbVar = (njb) view;
                if (i == proxyListActivity.y) {
                    njbVar.setText(jb6.M0(2131746336, null));
                    return;
                }
                return;
            case 5:
                zv8 zv8Var = (zv8) view;
                fda fdaVar = (fda) arrayList2.get(i - proxyListActivity.n);
                zv8Var.setProxy(fdaVar);
                if (gda.x1 == fdaVar) {
                    z = true;
                } else {
                    z = false;
                }
                zv8Var.setChecked(z);
                boolean contains = arrayList.contains(arrayList2.get(i - proxyListActivity.n));
                zv8Var.h = contains;
                zv8Var.f.a(contains, false);
                zv8Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i == proxyListActivity.x) {
                    hla hlaVar = (hla) view;
                    ArrayList arrayList3 = new ArrayList(aw8.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        strArr[i3] = jb6.a0(null, null, 2131746335, arrayList3.get(i3));
                    }
                    hlaVar.setCallback(new i98((byte) 9));
                    hlaVar.b(gda.X0, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void M(u69 u69Var, int i) {
        TextView textView;
        mia miaVar = (mia) this.e;
        int i2 = u69Var.f;
        if (i2 != 0) {
            if (i2 == 1 && (textView = miaVar.o1) != null) {
                textView.setText(jb6.a0("SharingLiveLocationTitle", null, 2131745126, jb6.G(dd6.g(), "Chats", new Object[0])));
                return;
            }
            return;
        }
        ((jia) u69Var.a).setDialog(mia.D0(i - 1));
    }

    private final void N(u69 u69Var, int i) {
        String str;
        edb edbVar = (edb) u69Var.a;
        fdb fdbVar = (fdb) this.d;
        ArrayList arrayList = fdbVar.x;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((ds6) arrayList.get(i)).a;
        }
        int direction = fdbVar.getDirection();
        int i2 = edb.h;
        edbVar.a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = edbVar.b;
                if (!(drawable instanceof vm) || ((vm) drawable).h() != parseLong) {
                    edbVar.setImageDrawable(vm.m(z8c.t0, parseLong, null, edbVar.f.c()));
                }
            } catch (Exception unused) {
                edbVar.setImageDrawable(null);
            }
        } else {
            edbVar.setImageDrawable(gw3.f(str));
        }
        if (edbVar.d != direction) {
            edbVar.d = direction;
            edbVar.requestLayout();
        }
    }

    private final void O(u69 u69Var, int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (u69Var.f == 0) {
            hg3 hg3Var = (hg3) u69Var.a;
            boolean z = true;
            if (i == arrayList.size() - 1) {
                z = false;
            }
            hg3Var.t2 = z;
            hg3Var.setDialog((cg3) arrayList.get(i));
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                int b2 = u69Var.b();
                if (b2 != 1 && (!MediaController.r0(vn9.Z((vn9) obj)) || b2 != 2)) {
                    return false;
                }
                return true;
            case 1:
                int b3 = u69Var.b();
                v72 v72Var = (v72) obj;
                if (b3 != v72Var.v0 && b3 != v72Var.H0 && b3 != v72Var.C0 && b3 != v72Var.G0 && b3 != v72Var.D0 && b3 != v72Var.I0 && b3 != v72Var.E0 && b3 != v72Var.F0 && b3 != v72Var.J0 && b3 != v72Var.K0 && b3 != v72Var.O0.b && b3 != v72Var.N0.b && b3 != v72Var.M0) {
                    return false;
                }
                return true;
            case 2:
                int b4 = u69Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj;
                if (b4 != DataAutoDownloadActivity.k0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.l0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.d0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.m0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 3:
                int b5 = u69Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                if (b5 != dataSettingsActivity.e && b5 != dataSettingsActivity.f && b5 != dataSettingsActivity.h && b5 != dataSettingsActivity.s && b5 != DataSettingsActivity.a0(dataSettingsActivity) && b5 != dataSettingsActivity.w && b5 != DataSettingsActivity.b0(dataSettingsActivity) && b5 != DataSettingsActivity.c0(dataSettingsActivity) && b5 != dataSettingsActivity.F && b5 != dataSettingsActivity.E && b5 != dataSettingsActivity.G && b5 != dataSettingsActivity.H && b5 != dataSettingsActivity.L && b5 != dataSettingsActivity.K && b5 != dataSettingsActivity.n && b5 != DataSettingsActivity.f0(dataSettingsActivity) && b5 != DataSettingsActivity.d0(dataSettingsActivity) && b5 != DataSettingsActivity.h0(dataSettingsActivity) && b5 != DataSettingsActivity.Z(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                return true;
            case 6:
                if (wi8.G(3)[u69Var.f] != 1) {
                    return false;
                }
                return true;
            case 7:
                int b6 = u69Var.b();
                ph6 ph6Var = (ph6) obj;
                if (b6 != ph6Var.c && b6 != ph6Var.d && b6 != ph6Var.e && b6 != ph6Var.f && b6 != ph6Var.h && b6 != ph6Var.r) {
                    return false;
                }
                return true;
            case 8:
                int b7 = u69Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (b7 == notificationsSettingsActivity.y || b7 == notificationsSettingsActivity.E || b7 == notificationsSettingsActivity.F || b7 == notificationsSettingsActivity.L || b7 == notificationsSettingsActivity.N || b7 == notificationsSettingsActivity.T || b7 == notificationsSettingsActivity.O || b7 == notificationsSettingsActivity.M || b7 == notificationsSettingsActivity.S || b7 == notificationsSettingsActivity.G || b7 == notificationsSettingsActivity.H || b7 == notificationsSettingsActivity.P || b7 == notificationsSettingsActivity.r || b7 == notificationsSettingsActivity.s || b7 == notificationsSettingsActivity.U || b7 == notificationsSettingsActivity.K) {
                    return false;
                }
                return true;
            case 9:
                int b8 = u69Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (b8 != PasscodeActivity.a0(passcodeActivity) && b8 != PasscodeActivity.b0(passcodeActivity) && b8 != passcodeActivity.O && b8 != PasscodeActivity.c0(passcodeActivity) && b8 != PasscodeActivity.d0(passcodeActivity) && b8 != passcodeActivity.K && b8 != passcodeActivity.L) {
                    return false;
                }
                return true;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                w78 w78Var = (w78) obj;
                if (w78Var.K == null) {
                    if (TextUtils.isEmpty(w78Var.w)) {
                        if (u69Var.f != 3) {
                            return false;
                        }
                    } else if (u69Var.b() >= w78Var.f.size()) {
                        return false;
                    }
                }
                return true;
            case 13:
                return false;
            case 14:
                int b9 = u69Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (b9 != ProxyListActivity.e0(proxyListActivity) && b9 != proxyListActivity.w && b9 != ProxyListActivity.d0(proxyListActivity) && b9 != proxyListActivity.E && (b9 < proxyListActivity.n || b9 >= proxyListActivity.r)) {
                    return false;
                }
                return true;
            case 15:
                if (u69Var.f != 0) {
                    return false;
                }
                return true;
            case 16:
                return true;
            case 17:
                if (u69Var.f == 1) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    public final void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.F.size();
        boolean x = ProxyListActivity.Z(proxyListActivity).x();
        if (size > 0) {
            ProxyListActivity.a0(proxyListActivity).F(size, x);
            if (!x) {
                ProxyListActivity.b0(proxyListActivity).J();
                int i = proxyListActivity.n;
                n(i, proxyListActivity.r - i, 2);
            }
        } else if (x) {
            ProxyListActivity.c0(proxyListActivity).w();
            int i2 = proxyListActivity.n;
            n(i2, proxyListActivity.r - i2, 2);
        }
    }

    public final void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        proxyListActivity.F.clear();
        int i = proxyListActivity.n;
        n(i, proxyListActivity.r - i, 1);
        E();
    }

    public final void P(int i) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        int i2 = proxyListActivity.n;
        if (i >= i2 && i < proxyListActivity.r) {
            fda fdaVar = (fda) proxyListActivity.G.get(i - i2);
            if (arrayList.contains(fdaVar)) {
                arrayList.remove(fdaVar);
            } else {
                arrayList.add(fdaVar);
            }
            h(i, 1);
            E();
        }
    }

    @Override
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return 4;
            case 1:
                return ((v72) obj).R0;
            case 2:
                return ((DataAutoDownloadActivity) obj).y;
            case 3:
                return ((DataSettingsActivity) obj).U;
            case 4:
                return ((ig4) obj).h.size();
            case 5:
                int size = ((dh4) obj).u1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 6:
                return ((ll4) obj).F.size();
            case 7:
                return ((ph6) obj).w;
            case 8:
                return ((NotificationsSettingsActivity) obj).V;
            case 9:
                return ((PasscodeActivity) obj).Q;
            case 10:
                j68 j68Var = (j68) obj;
                ArrayList arrayList = j68Var.d;
                if (arrayList == null) {
                    return 0;
                }
                return (int) Math.ceil(arrayList.size() / j68Var.f);
            case 11:
                return ((n78) obj).G;
            case 12:
                w78 w78Var = (w78) obj;
                ArrayList arrayList2 = w78Var.n;
                ArrayList arrayList3 = w78Var.f;
                yn6 yn6Var = w78Var.K;
                if (yn6Var == null) {
                    if (arrayList3.isEmpty()) {
                        if (!TextUtils.isEmpty(w78Var.w) || arrayList2.isEmpty()) {
                            return 0;
                        }
                        return arrayList2.size() + 2;
                    }
                    return arrayList3.size() + (!w78Var.s ? 1 : 0);
                }
                return yn6Var.e.size();
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                pb8 pb8Var = photoViewer.d;
                if (pb8Var == null || pb8Var.d() == null) {
                    return 0;
                }
                return photoViewer.d.d().size();
            case 14:
                return ((ProxyListActivity) obj).e;
            case 15:
                return dd6.g() + 1;
            case 16:
                ArrayList arrayList4 = ((fdb) this.d).x;
                if (arrayList4 == null) {
                    return 0;
                }
                return arrayList4.size();
            case 17:
                return ((ArrayList) obj).size();
            default:
                return ((vgc) obj).h.size();
        }
    }

    @Override
    public final long c(int i) {
        int i2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 4:
                i2 = ((ig4) obj).l0.get(i);
                break;
            case 11:
            case 12:
                return i;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (i == proxyListActivity.f) {
                    return -1L;
                }
                if (i == proxyListActivity.s) {
                    return -2L;
                }
                if (i == ProxyListActivity.d0(proxyListActivity)) {
                    return -3L;
                }
                if (i == ProxyListActivity.e0(proxyListActivity)) {
                    return -4L;
                }
                if (i == proxyListActivity.h) {
                    return -6L;
                }
                if (i == proxyListActivity.E) {
                    return -8L;
                }
                if (i == proxyListActivity.w) {
                    return -9L;
                }
                if (i == proxyListActivity.x) {
                    return -10L;
                }
                if (i == proxyListActivity.y) {
                    return -11L;
                }
                int i3 = proxyListActivity.n;
                if (i >= i3 && i < proxyListActivity.r) {
                    return ((fda) proxyListActivity.G.get(i - i3)).hashCode();
                }
                return -7L;
            case 16:
                ArrayList arrayList = ((fdb) this.d).x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((ds6) arrayList.get(i)).a.hashCode();
            case 18:
                i2 = ((sgc) ((vgc) obj).h.get(i)).a;
                break;
            default:
                return super.c(i);
        }
        return i2;
    }

    @Override
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                if (i == 1) {
                    return 1;
                }
                if (i != 2) {
                    return 3;
                }
                return 2;
            case 1:
                v72 v72Var = (v72) obj;
                if (i != v72Var.C0 && i != v72Var.G0 && i != v72Var.H0 && i != v72Var.D0 && i != v72Var.E0 && i != v72Var.F0 && i != v72Var.I0 && i != v72Var.N0.b && i != v72Var.O0.b) {
                    if (i == v72Var.m0 || i == v72Var.t0 || i == v72Var.x0 || i == v72Var.p0) {
                        return 0;
                    }
                    if (i == v72Var.s0) {
                        return 1;
                    }
                    if (i == v72Var.w0 || i == v72Var.y0 || i == v72Var.r0 || i == v72Var.L0) {
                        return 2;
                    }
                    if (i == v72Var.v0 || i == v72Var.J0 || i == v72Var.M0) {
                        return 3;
                    }
                    if (i == v72Var.n0) {
                        return 4;
                    }
                    if (i == v72Var.o0) {
                        return 11;
                    }
                    if (i == v72Var.q0) {
                        return 7;
                    }
                    if (i == v72Var.z0 || i == v72Var.A0 || i == v72Var.K0) {
                        return 6;
                    }
                    if (i == v72Var.B0) {
                        return 8;
                    }
                    if (i != 0) {
                        return 5;
                    }
                    return 9;
                }
                return 10;
            case 2:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj;
                if (i == DataAutoDownloadActivity.Z(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i == dataAutoDownloadActivity.s) {
                    return 1;
                }
                if (i == dataAutoDownloadActivity.r || i == dataAutoDownloadActivity.w) {
                    return 2;
                }
                if (i == DataAutoDownloadActivity.e0(dataAutoDownloadActivity)) {
                    return 3;
                }
                if (i != DataAutoDownloadActivity.k0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.l0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.d0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.m0(dataAutoDownloadActivity)) {
                    return 5;
                }
                return 4;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                if (i == dataSettingsActivity.r || i == dataSettingsActivity.x || i == dataSettingsActivity.O || i == dataSettingsActivity.Q || i == dataSettingsActivity.M || i == dataSettingsActivity.R || i == dataSettingsActivity.T) {
                    return 0;
                }
                if (i == dataSettingsActivity.d || i == dataSettingsActivity.y || i == dataSettingsActivity.N || i == 0 || i == dataSettingsActivity.P || i == dataSettingsActivity.J || i == dataSettingsActivity.S) {
                    return 2;
                }
                if (i == dataSettingsActivity.F || i == dataSettingsActivity.E || i == dataSettingsActivity.G || i == dataSettingsActivity.H || i == dataSettingsActivity.K || i == dataSettingsActivity.L) {
                    return 3;
                }
                if (i == dataSettingsActivity.I) {
                    return 4;
                }
                if (i == dataSettingsActivity.e || i == dataSettingsActivity.h || i == dataSettingsActivity.f || i == DataSettingsActivity.f0(dataSettingsActivity) || i == DataSettingsActivity.d0(dataSettingsActivity) || i == DataSettingsActivity.h0(dataSettingsActivity)) {
                    return 5;
                }
                if (i == dataSettingsActivity.s || i == dataSettingsActivity.w || i == dataSettingsActivity.n) {
                    return 6;
                }
                return 1;
            case 4:
            case 5:
                return 0;
            case 6:
                return wi8.F(((dl4) ((ll4) obj).F.get(i)).b);
            case 7:
                ph6 ph6Var = (ph6) obj;
                if (i == 0) {
                    return 0;
                }
                if (i == ph6Var.c || i == ph6Var.d || i == ph6Var.e || i == ph6Var.f || i == ph6Var.h) {
                    return 1;
                }
                if (i == ph6Var.n) {
                    return 2;
                }
                if (i != ph6Var.r) {
                    return 4;
                }
                return 3;
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (i != notificationsSettingsActivity.L && i != notificationsSettingsActivity.N && i != notificationsSettingsActivity.T && i != notificationsSettingsActivity.H && i != notificationsSettingsActivity.O && i != notificationsSettingsActivity.F && i != notificationsSettingsActivity.y && i != notificationsSettingsActivity.r) {
                    i2 = notificationsSettingsActivity.inappSoundRow;
                    if (i != i2) {
                        i3 = notificationsSettingsActivity.inappVibrateRow;
                        if (i != i3 && i != notificationsSettingsActivity.x) {
                            i4 = notificationsSettingsActivity.inappPreviewRow;
                            if (i != i4) {
                                i5 = notificationsSettingsActivity.contactJoinedRow;
                                if (i != i5) {
                                    i6 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i != i6 && i != notificationsSettingsActivity.w) {
                                        i7 = notificationsSettingsActivity.badgeNumberMutedRow;
                                        if (i != i7) {
                                            i8 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                            if (i != i8) {
                                                i9 = notificationsSettingsActivity.badgeNumberShowRow;
                                                if (i != i9) {
                                                    i10 = notificationsSettingsActivity.inappPriorityRow;
                                                    if (i != i10) {
                                                        i11 = notificationsSettingsActivity.inchatSoundRow;
                                                        if (i != i11 && i != notificationsSettingsActivity.Q) {
                                                            i12 = notificationsSettingsActivity.accountsAllRow;
                                                            if (i != i12) {
                                                                i13 = notificationsSettingsActivity.resetNotificationsRow;
                                                                if (i != i13) {
                                                                    i14 = notificationsSettingsActivity.privateRow;
                                                                    if (i != i14) {
                                                                        i15 = notificationsSettingsActivity.groupRow;
                                                                        if (i != i15) {
                                                                            i16 = notificationsSettingsActivity.channelsRow;
                                                                            if (i != i16) {
                                                                                i17 = notificationsSettingsActivity.storiesRow;
                                                                                if (i != i17) {
                                                                                    i18 = notificationsSettingsActivity.reactionsRow;
                                                                                    if (i != i18) {
                                                                                        if (i == notificationsSettingsActivity.K || i == notificationsSettingsActivity.E || i == notificationsSettingsActivity.M || i == notificationsSettingsActivity.S || i == notificationsSettingsActivity.G || i == notificationsSettingsActivity.P || i == notificationsSettingsActivity.U) {
                                                                                            return 4;
                                                                                        }
                                                                                        if (i == notificationsSettingsActivity.s) {
                                                                                            return 6;
                                                                                        }
                                                                                        return 5;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return 3;
                                                                }
                                                                return 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 1;
                }
                return 0;
            case 9:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (i != PasscodeActivity.a0(passcodeActivity) && i != passcodeActivity.O && i != passcodeActivity.L && i != passcodeActivity.K) {
                    if (i == PasscodeActivity.c0(passcodeActivity) || i == PasscodeActivity.b0(passcodeActivity) || i == PasscodeActivity.d0(passcodeActivity)) {
                        return 1;
                    }
                    if (i == passcodeActivity.I || i == passcodeActivity.P || i == passcodeActivity.H || i == passcodeActivity.M) {
                        return 2;
                    }
                    if (i == passcodeActivity.N || i == passcodeActivity.J) {
                        return 3;
                    }
                    if (i == 0) {
                        return 4;
                    }
                }
                return 0;
            case 10:
                return 0;
            case 11:
                n78 n78Var = (n78) obj;
                if (i == n78Var.E || i == n78Var.F) {
                    return 1;
                }
                return 0;
            case 12:
                w78 w78Var = (w78) obj;
                ArrayList arrayList = w78Var.f;
                if (w78Var.Z) {
                    return 2;
                }
                if (w78Var.K == null) {
                    if (arrayList.isEmpty()) {
                        if (i == w78Var.n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i >= arrayList.size()) {
                        return 1;
                    }
                }
                return 0;
            case 13:
                return 0;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (i == proxyListActivity.f || i == proxyListActivity.s) {
                    return 0;
                }
                if (i == ProxyListActivity.d0(proxyListActivity) || i == proxyListActivity.E) {
                    return 1;
                }
                if (i == ProxyListActivity.e0(proxyListActivity) || i == proxyListActivity.w) {
                    return 3;
                }
                if (i == proxyListActivity.h) {
                    return 2;
                }
                if (i == proxyListActivity.x) {
                    return 6;
                }
                if (i >= proxyListActivity.n && i < proxyListActivity.r) {
                    return 5;
                }
                return 4;
            case 15:
                if (i == 0) {
                    return 1;
                }
                return 0;
            case 16:
            default:
                return super.d(i);
            case 17:
                if (i == ((ArrayList) obj).size()) {
                    return 1;
                }
                return 0;
            case 18:
                return 0;
        }
    }

    @Override
    public final void t(defpackage.u69 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s30.t(u69, int):void");
    }

    @Override
    public final void w(u69 u69Var, int i, List list) {
        boolean contains;
        switch (this.c) {
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i2 = u69Var.f;
                View view = u69Var.a;
                if (i2 == 5 && !list.isEmpty()) {
                    zv8 zv8Var = (zv8) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i - proxyListActivity.n))) != zv8Var.h) {
                        zv8Var.h = contains;
                        zv8Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        zv8Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (u69Var.f == 3 && list.contains(0)) {
                    bjb bjbVar = (bjb) view;
                    if (i == ProxyListActivity.e0(proxyListActivity)) {
                        bjbVar.setChecked(proxyListActivity.d);
                        return;
                    } else if (i == proxyListActivity.w) {
                        bjbVar.setChecked(gda.W0);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(u69Var, i);
                    return;
                }
            default:
                super.w(u69Var, i, list);
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        vkb vkbVar;
        t72 jf5Var;
        hla hlaVar;
        View bbaVar;
        FrameLayout frameLayout;
        ijb ijbVar;
        View jf5Var2;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        ylb ylbVar5;
        View bjbVar;
        y68 y68Var;
        int i2;
        xib xibVar;
        View bbaVar2;
        FrameLayout frameLayout2;
        View pa6Var;
        byte b = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Context context = (Context) obj2;
                if (i == 0) {
                    vkbVar = new jf5(context);
                } else if (i == 1) {
                    vkbVar = new bjb(context);
                } else if (i == 2) {
                    vkb vkbVar2 = new vkb(context);
                    vkbVar2.setCanDisable(true);
                    vkbVar = vkbVar2;
                } else {
                    vkbVar = new njb(context);
                }
                vkbVar.setLayoutParams(new g69(-1, -2));
                return new u69(vkbVar);
            case 1:
                Context context2 = (Context) obj2;
                v72 v72Var = (v72) obj;
                boolean z = v72Var.n;
                ylb ylbVar6 = v72Var.a;
                switch (i) {
                    case 0:
                        jf5Var = new jf5((Context) obj2, cmb.K6, 21, 15, false, v72Var.a);
                        break;
                    case 1:
                        View bbaVar3 = new bba(context2, (hg9) null);
                        new sn2(new ColorDrawable(cmb.v0(cmb.Z6, ylbVar6)), cmb.W0(context2, 2131231233, cmb.a7)).x = true;
                        jf5Var = bbaVar3;
                        break;
                    case 2:
                        jf5Var = new njb(context2, ylbVar6);
                        break;
                    case 3:
                        jf5Var = new xib(context2, ylbVar6);
                        break;
                    case 4:
                    case 11:
                        q72 q72Var = new q72(this, (Context) obj2, v72Var.J ? 1 : 0, v72Var.a, i);
                        if (i == 11 && !z) {
                            q72Var.setTextRight(98);
                            q72Var.b().setOnClickListener(new View.OnClickListener(this) {
                                public final s30 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    s30 s30Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            ((v72) s30Var.e).e0(-2);
                                            return;
                                        case 1:
                                            ((v72) s30Var.e).e0(-3);
                                            return;
                                        default:
                                            ((v72) s30Var.e).X(view, (ng8) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        q72Var.e();
                        q72Var.setIconsColor(cmb.n7);
                        q72Var.c(new r72(this, q72Var, i));
                        jf5Var = q72Var;
                        break;
                    case 5:
                    default:
                        t72 t72Var = new t72(this, (Context) obj2, v72Var.J ? 1 : 0, new View.OnClickListener(this) {
                            public final s30 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                byte b2 = r2;
                                s30 s30Var = this.b;
                                switch (b2) {
                                    case 0:
                                        ((v72) s30Var.e).e0(-2);
                                        return;
                                    case 1:
                                        ((v72) s30Var.e).e0(-3);
                                        return;
                                    default:
                                        ((v72) s30Var.e).X(view, (ng8) view.getParent(), true);
                                        return;
                                }
                            }
                        }, v72Var.a);
                        if (!z) {
                            t72Var.setTextRight(140);
                            t72Var.b().setOnClickListener(new rc1(this, t72Var, (byte) 11));
                        }
                        int i3 = cmb.n7;
                        t72Var.setIconsColor(i3);
                        jh2 jh2Var = t72Var.r;
                        if (jh2Var != null) {
                            jh2Var.getCheckBoxBase().i(gm.L(6.0f));
                            CheckBoxBase checkBoxBase = jh2Var.getCheckBoxBase();
                            float f = t72Var.a.e;
                            if (checkBoxBase.w != f) {
                                checkBoxBase.w = f;
                                checkBoxBase.b();
                            }
                        }
                        t72Var.getCheckBox().b(-1, i3, cmb.j7);
                        t72Var.c(new qz(this, t72Var, (byte) 2));
                        t72Var.setShowNextButton(true);
                        EditTextBoldCursor textView = t72Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new eg(this, t72Var, (byte) 2));
                        textView.setOnKeyListener(new w6(t72Var, (byte) 2));
                        jf5Var = t72Var;
                        break;
                    case 6:
                        jf5Var = new bjb(context2, ylbVar6);
                        break;
                    case 7:
                        s72 s72Var = new s72(this, context2, v72Var.J ? 1 : 0);
                        s72Var.e();
                        if (!z) {
                            s72Var.setTextRight(98);
                            s72Var.b().setOnClickListener(new View.OnClickListener(this) {
                                public final s30 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    s30 s30Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            ((v72) s30Var.e).e0(-2);
                                            return;
                                        case 1:
                                            ((v72) s30Var.e).e0(-3);
                                            return;
                                        default:
                                            ((v72) s30Var.e).X(view, (ng8) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        s72Var.setIconsColor(cmb.n7);
                        s72Var.c(new qz(this, s72Var, (byte) 1));
                        jf5Var = s72Var;
                        break;
                    case 8:
                        View o72Var = new o72(context2, (byte) 0);
                        o72Var.setTag(-33024);
                        jf5Var = o72Var;
                        break;
                    case 9:
                        View sbVar = new sb((byte) 6, context2, this);
                        sbVar.setTag(-33024);
                        jf5Var = sbVar;
                        break;
                    case 10:
                        lg8 lg8Var = new lg8(context2, ylbVar6);
                        lg8Var.getCheckBox().setIcon(2131232530);
                        jf5Var = lg8Var;
                        break;
                }
                return kt6.h(jf5Var, jf5Var, -1, -2);
            case 2:
                Context context3 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    hlaVar = new njb(context3);
                                } else {
                                    hlaVar = new yn7(context3);
                                }
                            } else {
                                hla hlaVar2 = new hla(context3, null);
                                hlaVar2.setCallback(new wm2(this, (byte) 15));
                                hlaVar = hlaVar2;
                            }
                        } else {
                            hlaVar = new jf5(context3);
                        }
                    } else {
                        hlaVar = new bba(context3, (hg9) null);
                    }
                } else {
                    bjb bjbVar2 = new bjb(context3);
                    bjbVar2.d(cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
                    bjbVar2.setTypeface(gm.o());
                    bjbVar2.setHeight(56);
                    hlaVar = bjbVar2;
                }
                return kt6.h(hlaVar, hlaVar, -1, -2);
            case 3:
                Context context4 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        bbaVar = new xib(context4);
                                    } else {
                                        bbaVar = new yn7(context4);
                                    }
                                } else {
                                    bbaVar = new njb(context4);
                                }
                            } else {
                                bbaVar = new bjb(context4);
                            }
                        } else {
                            bbaVar = new jf5(context4, 22);
                        }
                    } else {
                        bbaVar = new vkb(context4);
                    }
                } else {
                    bbaVar = new bba(context4, (hg9) null);
                }
                return kt6.h(bbaVar, bbaVar, -1, -2);
            case 4:
                return new u69(new gg4((ig4) obj, (Context) obj2));
            case 5:
                gy0 gy0Var = new gy0(0, null, (Activity) obj2);
                gy0Var.setBackground(null);
                gy0Var.setLayoutParams(new g69(-1, -2));
                return new u69(gy0Var);
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                int F = wi8.F(wi8.G(3)[i]);
                if (F != 1) {
                    if (F != 2) {
                        frameLayout = new ae(launchActivity, null);
                    } else {
                        ?? frameLayout3 = new FrameLayout(launchActivity);
                        frameLayout3.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout3.h = textPaint;
                        textPaint.setTextSize(gm.L(16.0f));
                        dx9 dx9Var = new dx9(launchActivity);
                        frameLayout3.a = dx9Var;
                        dx9Var.setReportChanges(true);
                        dx9Var.setDelegate(new fk3((Object) frameLayout3));
                        dx9Var.setImportantForAccessibility(2);
                        frameLayout3.addView(dx9Var, qoe.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout = new jf5(launchActivity);
                }
                frameLayout.setLayoutParams(new g69(-1, -2));
                return new u69(frameLayout);
            case 7:
                Context context5 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ijbVar = new njb(context5);
                            } else {
                                View vkbVar3 = new vkb(context5);
                                anb.h(cmb.c6, null, vkbVar3);
                                ijbVar = vkbVar3;
                            }
                        } else {
                            ijbVar = new bba(context5, (hg9) null);
                        }
                    } else {
                        ijb ijbVar2 = new ijb(context5);
                        ijbVar2.setMultilineDetail(true);
                        anb.h(cmb.c6, null, ijbVar2);
                        ijbVar = ijbVar2;
                    }
                } else {
                    View jf5Var3 = new jf5(context5);
                    anb.h(cmb.c6, null, jf5Var3);
                    ijbVar = jf5Var3;
                }
                return kt6.h(ijbVar, ijbVar, -1, -2);
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context6 = (Context) obj2;
                if (i == 0) {
                    ylbVar = ((d) notificationsSettingsActivity).resourceProvider;
                    jf5Var2 = new jf5(context6, ylbVar);
                } else if (i == 1) {
                    ylbVar2 = ((d) notificationsSettingsActivity).resourceProvider;
                    jf5Var2 = new bjb(context6, ylbVar2);
                } else if (i != 2) {
                    if (i == 3) {
                        ylbVar3 = ((d) notificationsSettingsActivity).resourceProvider;
                        jf5Var2 = new yn7((Context) obj2, 21, 64, true, ylbVar3);
                    } else if (i != 4) {
                        if (i != 5) {
                            ylbVar5 = ((d) notificationsSettingsActivity).resourceProvider;
                            jf5Var2 = new njb(context6, ylbVar5);
                        } else {
                            ylbVar4 = ((d) notificationsSettingsActivity).resourceProvider;
                            jf5Var2 = new vkb(0, ylbVar4, context6);
                        }
                    } else {
                        jf5Var2 = new bba(context6, (hg9) null);
                    }
                } else {
                    jf5Var2 = new ijb(context6);
                }
                return new u69(jf5Var2);
            case 9:
                Context context7 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                bjbVar = new njb(context7);
                            } else {
                                bjbVar = new nx7(context7);
                                bjbVar.setTag(-33024);
                            }
                        } else {
                            bjbVar = new jf5(context7);
                        }
                    } else {
                        bjbVar = new vkb(context7);
                    }
                } else {
                    bjbVar = new bjb(context7);
                }
                return new u69(bjbVar);
            case 10:
                Context context8 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context8);
                frameLayout4.e = new Paint();
                frameLayout4.b = new yn6[4];
                frameLayout4.a = new x78[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    frameLayout4.a[i4] = new x78((z78) frameLayout4, context8);
                    frameLayout4.addView(frameLayout4.a[i4]);
                    frameLayout4.a[i4].setVisibility(4);
                    frameLayout4.a[i4].setTag(Integer.valueOf(i4));
                    frameLayout4.a[i4].setOnClickListener(new m67(frameLayout4, (byte) 16));
                }
                frameLayout4.setDelegate(new h68(this, (byte) 0));
                return new u69(frameLayout4);
            case 11:
                Context context9 = (Context) obj2;
                if (i == 0) {
                    ylb ylbVar7 = ((n78) obj).J0;
                    ?? frameLayout5 = new FrameLayout(context9);
                    frameLayout5.e = new ei7(frameLayout5, (byte) 7);
                    TextView textView2 = new TextView(context9);
                    frameLayout5.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout5.addView(textView2, qoe.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context9);
                    frameLayout5.b = textView3;
                    anb.X(textView3, cmb.pg, ylbVar7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout5.addView(textView3, qoe.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view = new View(context9);
                    Paint paint = new Paint();
                    view.a = paint;
                    Paint paint2 = new Paint(1);
                    view.b = paint2;
                    view.c = gm.L(16.0f);
                    view.d = 0;
                    view.e = 0.0f;
                    view.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout5.c = view;
                    frameLayout5.addView(view, qoe.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout5.setSeekBarDelegate(new h68(this, (byte) 1));
                    y68Var = frameLayout5;
                } else {
                    y68 y68Var2 = new y68(context9);
                    y68Var2.setOnClickListener(new m67(this, (byte) 14));
                    y68Var = y68Var2;
                }
                return new u69(y68Var);
            case 12:
                w78 w78Var = (w78) obj;
                boolean z2 = w78Var.s0;
                Context context10 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                aq3 aq3Var = new aq3(context10, null);
                                aq3Var.setForceDarkTheme(z2);
                                xibVar = aq3Var;
                            } else {
                                xib xibVar2 = new xib(23, context10, true);
                                xibVar2.setLayoutParams(new g69(-1, -2));
                                xibVar = xibVar2;
                                if (z2) {
                                    anb.W(xibVar2.a, w78Var.w0, null);
                                    anb.s(xibVar2.e, cmb.hh, null, PorterDuff.Mode.MULTIPLY);
                                    xibVar = xibVar2;
                                }
                            }
                        } else {
                            xibVar = new ida(1, null, context10);
                        }
                    } else {
                        ViewGroup frameLayout6 = new FrameLayout(context10);
                        frameLayout6.setLayoutParams(new g69(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context10, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout6.addView(radialProgressView, qoe.c(-1.0f, -1));
                        xibVar = frameLayout6;
                    }
                } else {
                    q68 q68Var = new q68(context10, null);
                    q68Var.setDelegate(new t78(this));
                    FrameLayout checkFrame = q68Var.getCheckFrame();
                    if (w78Var.U != 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    checkFrame.setVisibility(i2);
                    xibVar = q68Var;
                }
                return new u69(xibVar);
            case 13:
                Context context11 = (Context) obj2;
                ?? frameLayout7 = new FrameLayout(context11);
                frameLayout7.setWillNotDraw(false);
                bf0 bf0Var = new bf0(context11);
                frameLayout7.a = bf0Var;
                bf0Var.setRoundRadius(gm.L(4.0f));
                frameLayout7.addView(bf0Var, qoe.c(-1.0f, -1));
                FrameLayout frameLayout8 = new FrameLayout(context11);
                frameLayout7.b = frameLayout8;
                frameLayout7.addView(frameLayout8, qoe.e(42, 42, 53));
                jp0 jp0Var = new jp0(context11);
                jp0Var.c = new Path();
                jp0Var.b = new float[8];
                jp0Var.d = new RectF();
                jp0Var.e = new Paint(1);
                frameLayout7.e = jp0Var;
                jp0Var.setWillNotDraw(false);
                jp0Var.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
                frameLayout7.addView(jp0Var, qoe.e(-1, 16, 83));
                jp0Var.addView(td4.k(context11, 2131231467), qoe.e(-2, -2, 19));
                TextView textView4 = new TextView(context11);
                frameLayout7.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                jp0Var.addView(textView4, qoe.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                jh2 jh2Var2 = new jh2(24, null, context11);
                frameLayout7.c = jh2Var2;
                jh2Var2.setDrawBackgroundAsArc(11);
                jh2Var2.b(cmb.V9, cmb.W9, cmb.U9);
                frameLayout7.addView(jh2Var2, qoe.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                jh2Var2.setVisibility(0);
                frameLayout7.setFocusable(true);
                frameLayout8.setOnClickListener(new m67(this, (byte) 18));
                return new u69(frameLayout7);
            case 14:
                Context context12 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 6) {
                                        bbaVar2 = new zv8((ProxyListActivity) obj, context12);
                                        anb.h(cmb.c6, null, bbaVar2);
                                    } else {
                                        bbaVar2 = new hla(context12, null);
                                        anb.h(cmb.c6, null, bbaVar2);
                                    }
                                } else {
                                    bbaVar2 = new njb(context12);
                                }
                            } else {
                                bbaVar2 = new bjb(context12);
                                anb.h(cmb.c6, null, bbaVar2);
                            }
                        } else {
                            bbaVar2 = new jf5(context12);
                            anb.h(cmb.c6, null, bbaVar2);
                        }
                    } else {
                        bbaVar2 = new vkb(context12);
                        anb.h(cmb.c6, null, bbaVar2);
                    }
                } else {
                    bbaVar2 = new bba(context12, (hg9) null);
                }
                return kt6.h(bbaVar2, bbaVar2, -1, -2);
            case 15:
                Context context13 = (Context) obj2;
                mia miaVar = (mia) obj;
                if (i != 0) {
                    FrameLayout ct8Var = new ct8(context13, (byte) 7);
                    ct8Var.setWillNotDraw(false);
                    TextView textView5 = new TextView(context13);
                    miaVar.o1 = textView5;
                    anb.X(textView5, cmb.I5, miaVar.J0);
                    miaVar.o1.setTextSize(1, 14.0f);
                    miaVar.o1.setGravity(17);
                    miaVar.o1.setPadding(0, 0, 0, gm.L(8.0f));
                    ct8Var.addView(miaVar.o1, qoe.c(40.0f, -1));
                    frameLayout2 = ct8Var;
                } else {
                    frameLayout2 = new jia(54, miaVar.J0, context13, false);
                }
                return new u69(frameLayout2);
            case 16:
                return new u69(new edb((fdb) obj, ((fdb) obj2).getContext()));
            case 17:
                Context context14 = (Context) obj2;
                if (i == 0) {
                    pa6Var = new hg3(context14, false);
                } else {
                    pa6Var = new pa6(context14);
                }
                pa6Var.setLayoutParams(new g69(-1, -2));
                return new u69(pa6Var);
            default:
                return new u69(new tgc((vgc) obj, (Context) obj2));
        }
    }

    @Override
    public final void y(u69 u69Var) {
        int i;
        int i2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 1:
                v72 v72Var = (v72) obj;
                wf8 wf8Var = v72Var.n1;
                boolean z = v72Var.n;
                int i3 = u69Var.f;
                View view = u69Var.a;
                CharSequence charSequence = "";
                if (i3 == 4) {
                    ng8 ng8Var = (ng8) view;
                    ng8Var.setTag(1);
                    CharSequence charSequence2 = v72Var.O;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z) {
                        i2 = 2131743738;
                    } else {
                        i2 = 2131746181;
                    }
                    ng8Var.o(charSequence, jb6.M0(i2, null), true);
                    ng8Var.setTag(null);
                    v72Var.i0(u69Var.b(), view);
                    return;
                } else if (i3 == 11) {
                    ng8 ng8Var2 = (ng8) view;
                    ng8Var2.setTag(1);
                    CharSequence charSequence3 = v72Var.P;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    ng8Var2.o(charSequence, jb6.M0(2131746182, null), false);
                    ng8Var2.setTag(null);
                    ng8Var2.e.a(wf8Var.b(-2), false);
                    v72Var.i0(u69Var.b(), view);
                    return;
                } else if (i3 == 5) {
                    int b2 = u69Var.b();
                    ng8 ng8Var3 = (ng8) view;
                    ng8Var3.setTag(1);
                    ng8Var3.a.a(v72Var.c0, false);
                    int i4 = b2 - v72Var.u0;
                    CharSequence charSequence4 = v72Var.L[i4];
                    if (z) {
                        i = 2131743740;
                    } else {
                        i = 2131747507;
                    }
                    ng8Var3.o(charSequence4, jb6.M0(i, null), true);
                    ng8Var3.setTag(null);
                    if (v72Var.l0 == b2) {
                        EditTextBoldCursor textView = ng8Var3.getTextView();
                        textView.requestFocus();
                        gm.E3(textView);
                        v72Var.l0 = -1;
                    }
                    if (!z) {
                        ng8Var3.e.a(wf8Var.b(i4), false);
                    }
                    v72Var.i0(b2, view);
                    return;
                } else if (i3 == 7) {
                    ng8 ng8Var4 = (ng8) view;
                    ng8Var4.setTag(1);
                    CharSequence charSequence5 = v72Var.Q;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    ng8Var4.o(charSequence, jb6.M0(2131754471, null), false);
                    ng8Var4.setTag(null);
                    if (!z) {
                        ng8Var4.e.a(wf8Var.b(-3), false);
                    }
                    v72Var.i0(u69Var.b(), view);
                    return;
                } else {
                    return;
                }
            case 3:
                if (u69Var.f == 3) {
                    bjb bjbVar = (bjb) u69Var.a;
                    int b3 = u69Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b3 == dataSettingsActivity.F) {
                        bjbVar.setChecked(gda.A0);
                        return;
                    } else if (b3 == dataSettingsActivity.E) {
                        bjbVar.setChecked(gda.x0);
                        return;
                    } else if (b3 == dataSettingsActivity.G) {
                        bjbVar.setChecked(gda.y0);
                        return;
                    } else if (b3 == dataSettingsActivity.H) {
                        bjbVar.setChecked(gda.z0);
                        return;
                    } else if (b3 == dataSettingsActivity.K) {
                        boolean z2 = gda.a;
                        bjbVar.setChecked(e86.e(2048));
                        return;
                    } else if (b3 == dataSettingsActivity.L) {
                        boolean z3 = gda.a;
                        bjbVar.setChecked(e86.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (u69Var.f == 3) {
                    bjb bjbVar2 = (bjb) u69Var.a;
                    int b4 = u69Var.b();
                    if (b4 == ProxyListActivity.e0(proxyListActivity)) {
                        bjbVar2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b4 == proxyListActivity.w) {
                        bjbVar2.setChecked(gda.W0);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void z(u69 u69Var) {
        switch (this.c) {
            case 1:
                v72 v72Var = (v72) this.e;
                int i = u69Var.f;
                if (i == 4 || i == 11 || i == 5) {
                    EditTextBoldCursor textView = ((ng8) u69Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (v72Var.J) {
                            n72 n72Var = v72Var.y;
                            if (n72Var != null) {
                                n72Var.e();
                            }
                            v72Var.Z(true);
                        }
                        v72Var.h1 = null;
                        textView.clearFocus();
                        gm.t1(textView);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public s30(ll4 ll4Var, LaunchActivity launchActivity) {
        this.c = (byte) 6;
        this.e = ll4Var;
        this.d = launchActivity;
    }

    public s30(Object obj, Object obj2, byte b) {
        this.c = b;
        this.e = obj;
        this.d = obj2;
    }

    public s30(ProxyListActivity proxyListActivity, Context context) {
        this.c = (byte) 14;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
