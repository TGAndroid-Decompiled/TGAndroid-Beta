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
import org.telegram.ui.ActionBar.e;
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
public final class t20 extends c79 {
    public final byte c;
    public final Object d;
    public final Object e;

    public t20(Context context) {
        this.c = (byte) 17;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        jf3 jf3Var = new jf3();
        jf3Var.a = ob6.M0(2131743824, null);
        jf3Var.b = ob6.M0(2131743816, null);
        jf3Var.c = (byte) 0;
        jf3Var.d = (byte) 0;
        jf3Var.e = true;
        jf3Var.f = false;
        jf3Var.g = (byte) 0;
        jf3Var.h = currentTimeMillis;
        jf3Var.i = false;
        jf3Var.j = false;
        jf3Var.k = 2;
        arrayList.add(jf3Var);
        jf3 jf3Var2 = new jf3();
        jf3Var2.a = ob6.M0(2131743823, null);
        jf3Var2.b = ob6.M0(2131743815, null);
        jf3Var2.c = (byte) 1;
        jf3Var2.d = (byte) 2;
        jf3Var2.e = false;
        jf3Var2.f = false;
        jf3Var2.g = (byte) 0;
        jf3Var2.h = currentTimeMillis - 3600;
        jf3Var2.i = false;
        jf3Var2.j = false;
        jf3Var2.k = -1;
        arrayList.add(jf3Var2);
        jf3 jf3Var3 = new jf3();
        jf3Var3.a = ob6.M0(2131743822, null);
        jf3Var3.b = ob6.M0(2131743814, null);
        jf3Var3.c = (byte) 2;
        jf3Var3.d = (byte) 3;
        jf3Var3.e = false;
        jf3Var3.f = true;
        jf3Var3.g = (byte) 0;
        jf3Var3.h = currentTimeMillis - 7200;
        jf3Var3.i = false;
        jf3Var3.j = true;
        jf3Var3.k = -1;
        arrayList.add(jf3Var3);
        jf3 jf3Var4 = new jf3();
        jf3Var4.a = ob6.M0(2131743821, null);
        jf3Var4.b = ob6.M0(2131743813, null);
        jf3Var4.c = (byte) 3;
        jf3Var4.d = (byte) 0;
        jf3Var4.e = false;
        jf3Var4.f = false;
        jf3Var4.g = (byte) 2;
        jf3Var4.h = currentTimeMillis - 10800;
        jf3Var4.i = false;
        jf3Var4.j = false;
        jf3Var4.k = -1;
        arrayList.add(jf3Var4);
        jf3 jf3Var5 = new jf3();
        jf3Var5.a = ob6.M0(2131743820, null);
        jf3Var5.b = ob6.M0(2131743812, null);
        jf3Var5.c = (byte) 4;
        jf3Var5.d = (byte) 0;
        jf3Var5.e = false;
        jf3Var5.f = false;
        jf3Var5.g = (byte) 1;
        jf3Var5.h = currentTimeMillis - 14400;
        jf3Var5.i = false;
        jf3Var5.j = false;
        jf3Var5.k = 2;
        arrayList.add(jf3Var5);
        jf3 jf3Var6 = new jf3();
        jf3Var6.a = ob6.M0(2131743819, null);
        jf3Var6.b = ob6.M0(2131743811, null);
        jf3Var6.c = (byte) 5;
        jf3Var6.d = (byte) 0;
        jf3Var6.e = false;
        jf3Var6.f = false;
        jf3Var6.g = (byte) 0;
        jf3Var6.h = currentTimeMillis - 18000;
        jf3Var6.i = false;
        jf3Var6.j = false;
        jf3Var6.k = -1;
        arrayList.add(jf3Var6);
        jf3 jf3Var7 = new jf3();
        jf3Var7.a = ob6.M0(2131743818, null);
        jf3Var7.b = ob6.M0(2131743810, null);
        jf3Var7.c = (byte) 6;
        jf3Var7.d = (byte) 0;
        jf3Var7.e = false;
        jf3Var7.f = false;
        jf3Var7.g = (byte) 0;
        jf3Var7.h = currentTimeMillis - 21600;
        jf3Var7.i = true;
        jf3Var7.j = false;
        jf3Var7.k = -1;
        arrayList.add(jf3Var7);
        jf3 jf3Var8 = new jf3();
        jf3Var8.a = ob6.M0(2131743817, null);
        jf3Var8.b = ob6.M0(2131743809, null);
        jf3Var8.c = (byte) 0;
        jf3Var8.d = (byte) 0;
        jf3Var8.e = false;
        jf3Var8.f = false;
        jf3Var8.g = (byte) 0;
        jf3Var8.h = currentTimeMillis - 25200;
        jf3Var8.i = true;
        jf3Var8.j = false;
        jf3Var8.k = -1;
        arrayList.add(jf3Var8);
    }

    private final void G(defpackage.f89 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.G(f89, int):void");
    }

    private final void H(f89 f89Var, int i) {
        String a0;
        PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            sy7 sy7Var = (sy7) view;
                            sy7Var.a.f(2131624320, 100, 100, null);
                            sy7Var.a.d();
                            return;
                        }
                        return;
                    }
                    mf5 mf5Var = (mf5) view;
                    mf5Var.setHeight(46);
                    if (i == passcodeActivity.N) {
                        mf5Var.setText(ob6.M0(2131745571, null));
                        return;
                    } else if (i == passcodeActivity.J) {
                        mf5Var.setText(ob6.M0(2131742729, null));
                        return;
                    } else {
                        return;
                    }
                }
                ilb ilbVar = (ilb) view;
                if (i == passcodeActivity.H) {
                    ilbVar.setText(ob6.M0(2131747382, null));
                    ilbVar.setBackground(null);
                    ilbVar.getTextView().setGravity(1);
                    return;
                } else if (i == passcodeActivity.I) {
                    ilbVar.setText(ob6.M0(2131753790, null));
                    p66 textView = ilbVar.getTextView();
                    if (ob6.a0) {
                        i3 = 5;
                    }
                    textView.setGravity(i3);
                    return;
                } else if (i == passcodeActivity.M) {
                    ilbVar.setText(ob6.M0(2131742728, null));
                    p66 textView2 = ilbVar.getTextView();
                    if (ob6.a0) {
                        i3 = 5;
                    }
                    textView2.setGravity(i3);
                    return;
                } else if (i == passcodeActivity.P) {
                    ilbVar.setText(ob6.M0(2131745570, null));
                    p66 textView3 = ilbVar.getTextView();
                    if (ob6.a0) {
                        i3 = 5;
                    }
                    textView3.setGravity(i3);
                    return;
                } else {
                    return;
                }
            }
            qmb qmbVar = (qmb) view;
            if (i == PasscodeActivity.Z(passcodeActivity)) {
                qmbVar.b(ob6.M0(2131752525, null), true);
                if (xea.r.isEmpty()) {
                    int i4 = aob.E6;
                    qmbVar.setTag(Integer.valueOf(i4));
                    yob.X(qmbVar.getTextView(), i4, null);
                    return;
                }
                int i5 = aob.G6;
                qmbVar.setTag(Integer.valueOf(i5));
                yob.X(qmbVar.getTextView(), i5, null);
                return;
            } else if (i == PasscodeActivity.Y(passcodeActivity)) {
                int i6 = xea.x;
                if (i6 == 0) {
                    a0 = ob6.a0("AutoLockDisabled", null, 2131753792, new Object[0]);
                } else if (i6 < 3600) {
                    a0 = ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(i6 / 60, "Minutes", new Object[0]));
                } else if (i6 < 86400) {
                    a0 = ob6.a0("AutoLockInTime", null, 2131753791, ob6.G((int) Math.ceil((i6 / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else {
                    a0 = ob6.a0("AutoLockInTime", null, 2131753791, ob6.G((int) Math.ceil(((i6 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                }
                qmbVar.c(ob6.M0(2131753793, null), a0, false, true);
                int i7 = aob.G6;
                qmbVar.setTag(Integer.valueOf(i7));
                yob.X(qmbVar.getTextView(), i7, null);
                return;
            } else if (i == PasscodeActivity.a0(passcodeActivity)) {
                qmbVar.b(ob6.M0(2131751398, null), false);
                int i8 = aob.q7;
                qmbVar.setTag(Integer.valueOf(i8));
                yob.X(qmbVar.getTextView(), i8, null);
                return;
            } else {
                return;
            }
        }
        wkb wkbVar = (wkb) view;
        if (i == PasscodeActivity.b0(passcodeActivity)) {
            wkbVar.f(ob6.M0(2131743528, null), xea.C, false);
        } else if (i == passcodeActivity.O) {
            wkbVar.f(ob6.M0(2131745569, null), xea.z, false);
        } else if (i == passcodeActivity.L) {
            String M0 = ob6.M0(2131742817, null);
            if (!c.C(PasscodeActivity.i0(passcodeActivity)).e() || !c.C(PasscodeActivity.j0(passcodeActivity)).R()) {
                z = false;
            }
            wkbVar.f(M0, z, false);
        } else if (i == passcodeActivity.K) {
            wkbVar.f(ob6.M0(2131742816, null), c.C(PasscodeActivity.k0(passcodeActivity)).S(), false);
        }
    }

    private final void I(f89 f89Var, int i) {
        c98 c98Var = (c98) this.e;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                l88 l88Var = (l88) view;
                l88Var.setTag(Integer.valueOf(i));
                if (i == c98Var.E) {
                    l88Var.a(c98Var.O, ob6.M0(2131743767, null));
                    return;
                } else if (i == c98Var.F) {
                    l88Var.a(c98Var.P, ob6.M0(2131743768, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        o88 o88Var = (o88) view;
        o88Var.setTag(Integer.valueOf(i));
        if (i == c98Var.b) {
            o88Var.a(ob6.M0(2131751091, null), 0, c98Var.H);
        } else if (i == c98Var.r) {
            o88Var.a(ob6.M0(2131749056, null), -100, c98Var.Q);
        } else if (i == c98Var.d) {
            o88Var.a(ob6.M0(2131751734, null), -100, c98Var.J);
        } else if (i == c98Var.c) {
            o88Var.a(ob6.M0(2131750822, null), -100, c98Var.I);
        } else if (i == c98Var.f) {
            o88Var.a(ob6.M0(2131742580, null), -100, c98Var.K);
        } else if (i == c98Var.e) {
            o88Var.a(ob6.M0(2131745675, null), -100, c98Var.L);
        } else if (i == c98Var.w) {
            o88Var.a(ob6.M0(2131743176, null), 0, c98Var.S);
        } else if (i == c98Var.s) {
            o88Var.a(ob6.M0(2131745193, null), -100, c98Var.R);
        } else if (i == c98Var.x) {
            o88Var.a(ob6.M0(2131749295, null), 0, c98Var.T);
        } else if (i == c98Var.y) {
            o88Var.a(ob6.M0(2131745095, null), 0, c98Var.V);
        } else if (i == c98Var.h) {
            o88Var.a(ob6.M0(2131750811, null), 0, c98Var.M);
        } else if (i == c98Var.n) {
            o88Var.a(ob6.M0(2131745021, null), 0, c98Var.N);
        }
    }

    private final void J(f89 f89Var, int i) {
        boolean Q0;
        boolean z;
        l98 l98Var = (l98) this.e;
        do6 do6Var = l98Var.K;
        ArrayList arrayList = l98Var.n;
        ArrayList arrayList2 = l98Var.c;
        HashMap hashMap = l98Var.b;
        int i2 = f89Var.f;
        View view = f89Var.a;
        int i3 = -1;
        int i4 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        skb skbVar = (skb) view;
                        if (i < arrayList.size()) {
                            skbVar.o(2131232332, (CharSequence) arrayList.get(i), false);
                            return;
                        } else {
                            skbVar.o(2131232099, ob6.M0(2131752032, null), false);
                            return;
                        }
                    }
                    return;
                }
                no6 no6Var = (no6) do6Var.e.get(i);
                zea zeaVar = (zea) view;
                zeaVar.setPhotoEntry(no6Var);
                zeaVar.b(hashMap.containsKey(Integer.valueOf(no6Var.C)), false);
                zeaVar.setTag(Integer.valueOf(i));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = l98Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        d88 d88Var = (d88) view;
        d88Var.setItemSize(l98Var.S);
        de0 imageView = d88Var.getImageView();
        d88Var.setTag(Integer.valueOf(i));
        imageView.q();
        if (do6Var != null) {
            no6 no6Var2 = (no6) do6Var.e.get(i);
            if (arrayList2.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            d88Var.d(no6Var2, z, true, false, false);
            int i5 = no6Var2.C;
            if (l98Var.e) {
                i3 = arrayList2.indexOf(Integer.valueOf(i5));
            }
            d88Var.b(i3, hashMap.containsKey(Integer.valueOf(i5)), false);
            Q0 = PhotoViewer.Q0(no6Var2.I);
        } else {
            ro6 ro6Var = (ro6) l98Var.f.get(i);
            d88Var.e(ro6Var);
            d88Var.getVideoInfoContainer().setVisibility(4);
            if (l98Var.e) {
                i3 = arrayList2.indexOf(ro6Var.B);
            }
            d88Var.b(i3, hashMap.containsKey(ro6Var.B), false);
            Q0 = PhotoViewer.Q0(ro6Var.g());
        }
        imageView.getImageReceiver().v0(!Q0, true);
        d88Var.getCheckBox().setVisibility((l98Var.U != 0 || Q0) ? 8 : 8);
    }

    private final void K(f89 f89Var, int i) {
        int i2;
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        p98 p98Var = (p98) f89Var.a;
        int L = hl.L(85.0f);
        if (i != 0) {
            i2 = hl.L(6.0f);
        } else {
            i2 = 0;
        }
        p98Var.f = L;
        og2 og2Var = p98Var.c;
        de0 de0Var = p98Var.a;
        jo0 jo0Var = p98Var.e;
        p98Var.h = i2;
        ((FrameLayout.LayoutParams) p98Var.b.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) de0Var.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) jo0Var.getLayoutParams()).rightMargin = i2;
        de0Var.q();
        Object obj = photoViewer.d.u().get(photoViewer.d.d().get(i));
        if (obj instanceof no6) {
            no6 no6Var = (no6) obj;
            int i3 = no6Var.C;
            String str = no6Var.I;
            p98Var.setTag(no6Var);
            jo0Var.setVisibility(4);
            String str2 = no6Var.c;
            if (str2 != null) {
                de0Var.o(str2, null, context.getResources().getDrawable(2131232466));
            } else if (str != null) {
                de0Var.r(no6Var.J, no6Var.K, true);
                if (no6Var.b && !no6Var.d()) {
                    jo0Var.setVisibility(0);
                    p98Var.d.setText(hl.g0(no6Var.E, false, false));
                    de0Var.o("vthumb://" + i3 + ":" + str, null, context.getResources().getDrawable(2131232466));
                } else {
                    de0Var.o(dze.d("thumb://", i3, ":", str), null, context.getResources().getDrawable(2131232466));
                }
            } else {
                de0Var.setImageResource(2131232466);
            }
            og2Var.a.f(-1, true, false);
            og2Var.setVisibility(0);
        } else if (obj instanceof ro6) {
            ro6 ro6Var = (ro6) obj;
            p98Var.setTag(ro6Var);
            p98Var.setImage(ro6Var);
            jo0Var.setVisibility(4);
            og2Var.a.f(-1, true, false);
            og2Var.setVisibility(0);
        }
    }

    private final void L(f89 f89Var, int i) {
        boolean z;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z2 = true;
        switch (i2) {
            case 1:
                qmb qmbVar = (qmb) view;
                yob.X(qmbVar.getTextView(), aob.G6, null);
                if (i == ProxyListActivity.Y(proxyListActivity)) {
                    String M0 = ob6.M0(2131754384, null);
                    if (proxyListActivity.E == -1) {
                        z2 = false;
                    }
                    qmbVar.b(M0, z2);
                    return;
                } else if (i == proxyListActivity.E) {
                    yob.X(qmbVar.getTextView(), aob.p7, null);
                    qmbVar.b(ob6.M0(2131751545, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                mf5 mf5Var = (mf5) view;
                if (i == proxyListActivity.h) {
                    mf5Var.setText(ob6.M0(2131746332, null));
                    return;
                }
                return;
            case 3:
                wkb wkbVar = (wkb) view;
                if (i == ProxyListActivity.Z(proxyListActivity)) {
                    String M02 = ob6.M0(2131743438, null);
                    boolean z3 = proxyListActivity.d;
                    if (proxyListActivity.w == -1) {
                        z2 = false;
                    }
                    wkbVar.f(M02, z3, z2);
                    return;
                } else if (i == proxyListActivity.w) {
                    wkbVar.f(ob6.M0(2131743440, null), xea.W0, true);
                    return;
                } else {
                    return;
                }
            case 4:
                ilb ilbVar = (ilb) view;
                if (i == proxyListActivity.y) {
                    ilbVar.setText(ob6.M0(2131746330, null));
                    return;
                }
                return;
            case 5:
                hx8 hx8Var = (hx8) view;
                wea weaVar = (wea) arrayList2.get(i - proxyListActivity.n);
                hx8Var.setProxy(weaVar);
                if (xea.x1 == weaVar) {
                    z = true;
                } else {
                    z = false;
                }
                hx8Var.setChecked(z);
                boolean contains = arrayList.contains(arrayList2.get(i - proxyListActivity.n));
                hx8Var.h = contains;
                hx8Var.f.a(contains, false);
                hx8Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i == proxyListActivity.x) {
                    zma zmaVar = (zma) view;
                    ArrayList arrayList3 = new ArrayList(ix8.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        strArr[i3] = ob6.a0(null, null, 2131746329, arrayList3.get(i3));
                    }
                    zmaVar.setCallback(new ku7((byte) 29));
                    zmaVar.b(xea.X0, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void M(f89 f89Var, int i) {
        TextView textView;
        dka dkaVar = (dka) this.e;
        int i2 = f89Var.f;
        if (i2 != 0) {
            if (i2 == 1 && (textView = dkaVar.o1) != null) {
                textView.setText(ob6.a0("SharingLiveLocationTitle", null, 2131745120, ob6.G(id6.g(), "Chats", new Object[0])));
                return;
            }
            return;
        }
        ((aka) f89Var.a).setDialog(dka.E0(i - 1));
    }

    private final void N(f89 f89Var, int i) {
        String str;
        yeb yebVar = (yeb) f89Var.a;
        zeb zebVar = (zeb) this.d;
        ArrayList arrayList = zebVar.x;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((hs6) arrayList.get(i)).a;
        }
        int direction = zebVar.getDirection();
        int i2 = yeb.h;
        yebVar.a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = yebVar.b;
                if (!(drawable instanceof wl) || ((wl) drawable).h() != parseLong) {
                    yebVar.setImageDrawable(wl.m(yac.t0, parseLong, null, yebVar.f.c()));
                }
            } catch (Exception unused) {
                yebVar.setImageDrawable(null);
            }
        } else {
            yebVar.setImageDrawable(pv3.f(str));
        }
        if (yebVar.d != direction) {
            yebVar.d = direction;
            yebVar.requestLayout();
        }
    }

    private final void O(f89 f89Var, int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (f89Var.f == 0) {
            of3 of3Var = (of3) f89Var.a;
            boolean z = true;
            if (i == arrayList.size() - 1) {
                z = false;
            }
            of3Var.t2 = z;
            of3Var.setDialog((jf3) arrayList.get(i));
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                int b2 = f89Var.b();
                if (b2 != 1 && (!MediaController.v0(kp9.Y((kp9) obj)) || b2 != 2)) {
                    return false;
                }
                return true;
            case 1:
                int b3 = f89Var.b();
                a72 a72Var = (a72) obj;
                if (b3 != a72Var.v0 && b3 != a72Var.H0 && b3 != a72Var.C0 && b3 != a72Var.G0 && b3 != a72Var.D0 && b3 != a72Var.I0 && b3 != a72Var.E0 && b3 != a72Var.F0 && b3 != a72Var.J0 && b3 != a72Var.K0 && b3 != a72Var.O0.b && b3 != a72Var.N0.b && b3 != a72Var.M0) {
                    return false;
                }
                return true;
            case 2:
                int b4 = f89Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj;
                if (b4 != DataAutoDownloadActivity.a0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.d0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.Z(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.b0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 3:
                int b5 = f89Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                if (b5 != dataSettingsActivity.e && b5 != dataSettingsActivity.f && b5 != dataSettingsActivity.h && b5 != dataSettingsActivity.s && b5 != DataSettingsActivity.e0(dataSettingsActivity) && b5 != dataSettingsActivity.w && b5 != DataSettingsActivity.Z(dataSettingsActivity) && b5 != DataSettingsActivity.Y(dataSettingsActivity) && b5 != dataSettingsActivity.F && b5 != dataSettingsActivity.E && b5 != dataSettingsActivity.G && b5 != dataSettingsActivity.H && b5 != dataSettingsActivity.L && b5 != dataSettingsActivity.K && b5 != dataSettingsActivity.n && b5 != DataSettingsActivity.c0(dataSettingsActivity) && b5 != DataSettingsActivity.d0(dataSettingsActivity) && b5 != DataSettingsActivity.b0(dataSettingsActivity) && b5 != DataSettingsActivity.a0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                return true;
            case 6:
                if (ik8.G(3)[f89Var.f] != 1) {
                    return false;
                }
                return true;
            case 7:
                int b6 = f89Var.b();
                th6 th6Var = (th6) obj;
                if (b6 != th6Var.c && b6 != th6Var.d && b6 != th6Var.e && b6 != th6Var.f && b6 != th6Var.h && b6 != th6Var.r) {
                    return false;
                }
                return true;
            case 8:
                int b7 = f89Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (b7 == notificationsSettingsActivity.y || b7 == notificationsSettingsActivity.E || b7 == notificationsSettingsActivity.F || b7 == notificationsSettingsActivity.L || b7 == notificationsSettingsActivity.N || b7 == notificationsSettingsActivity.T || b7 == notificationsSettingsActivity.O || b7 == notificationsSettingsActivity.M || b7 == notificationsSettingsActivity.S || b7 == notificationsSettingsActivity.G || b7 == notificationsSettingsActivity.H || b7 == notificationsSettingsActivity.P || b7 == notificationsSettingsActivity.r || b7 == notificationsSettingsActivity.s || b7 == notificationsSettingsActivity.U || b7 == notificationsSettingsActivity.K) {
                    return false;
                }
                return true;
            case 9:
                int b8 = f89Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (b8 != PasscodeActivity.b0(passcodeActivity) && b8 != PasscodeActivity.Y(passcodeActivity) && b8 != passcodeActivity.O && b8 != PasscodeActivity.Z(passcodeActivity) && b8 != PasscodeActivity.a0(passcodeActivity) && b8 != passcodeActivity.K && b8 != passcodeActivity.L) {
                    return false;
                }
                return true;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                l98 l98Var = (l98) obj;
                if (l98Var.K == null) {
                    if (TextUtils.isEmpty(l98Var.w)) {
                        if (f89Var.f != 3) {
                            return false;
                        }
                    } else if (f89Var.b() >= l98Var.f.size()) {
                        return false;
                    }
                }
                return true;
            case 13:
                return false;
            case 14:
                int b9 = f89Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (b9 != ProxyListActivity.Z(proxyListActivity) && b9 != proxyListActivity.w && b9 != ProxyListActivity.Y(proxyListActivity) && b9 != proxyListActivity.E && (b9 < proxyListActivity.n || b9 >= proxyListActivity.r)) {
                    return false;
                }
                return true;
            case 15:
                if (f89Var.f != 0) {
                    return false;
                }
                return true;
            case 16:
                return true;
            case 17:
                if (f89Var.f == 1) {
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
        boolean z = ProxyListActivity.a0(proxyListActivity).z();
        if (size > 0) {
            ProxyListActivity.b0(proxyListActivity).H(size, z);
            if (!z) {
                ProxyListActivity.c0(proxyListActivity).L();
                int i = proxyListActivity.n;
                n(i, proxyListActivity.r - i, 2);
            }
        } else if (z) {
            ProxyListActivity.d0(proxyListActivity).y();
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
            wea weaVar = (wea) proxyListActivity.G.get(i - i2);
            if (arrayList.contains(weaVar)) {
                arrayList.remove(weaVar);
            } else {
                arrayList.add(weaVar);
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
                return ((a72) obj).R0;
            case 2:
                return ((DataAutoDownloadActivity) obj).y;
            case 3:
                return ((DataSettingsActivity) obj).U;
            case 4:
                return ((fg4) obj).h.size();
            case 5:
                int size = ((ah4) obj).u1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 6:
                return ((ll4) obj).F.size();
            case 7:
                return ((th6) obj).w;
            case 8:
                return ((NotificationsSettingsActivity) obj).V;
            case 9:
                return ((PasscodeActivity) obj).Q;
            case 10:
                w78 w78Var = (w78) obj;
                ArrayList arrayList = w78Var.d;
                if (arrayList == null) {
                    return 0;
                }
                return (int) Math.ceil(arrayList.size() / w78Var.f);
            case 11:
                return ((c98) obj).G;
            case 12:
                l98 l98Var = (l98) obj;
                ArrayList arrayList2 = l98Var.n;
                ArrayList arrayList3 = l98Var.f;
                do6 do6Var = l98Var.K;
                if (do6Var == null) {
                    if (arrayList3.isEmpty()) {
                        if (!TextUtils.isEmpty(l98Var.w) || arrayList2.isEmpty()) {
                            return 0;
                        }
                        return arrayList2.size() + 2;
                    }
                    return arrayList3.size() + (!l98Var.s ? 1 : 0);
                }
                return do6Var.e.size();
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                ed8 ed8Var = photoViewer.d;
                if (ed8Var == null || ed8Var.d() == null) {
                    return 0;
                }
                return photoViewer.d.d().size();
            case 14:
                return ((ProxyListActivity) obj).e;
            case 15:
                return id6.g() + 1;
            case 16:
                ArrayList arrayList4 = ((zeb) this.d).x;
                if (arrayList4 == null) {
                    return 0;
                }
                return arrayList4.size();
            case 17:
                return ((ArrayList) obj).size();
            default:
                return ((uic) obj).h.size();
        }
    }

    @Override
    public final long c(int i) {
        int i2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 4:
                i2 = ((fg4) obj).m0.get(i);
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
                if (i == ProxyListActivity.Y(proxyListActivity)) {
                    return -3L;
                }
                if (i == ProxyListActivity.Z(proxyListActivity)) {
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
                    return ((wea) proxyListActivity.G.get(i - i3)).hashCode();
                }
                return -7L;
            case 16:
                ArrayList arrayList = ((zeb) this.d).x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((hs6) arrayList.get(i)).a.hashCode();
            case 18:
                i2 = ((ric) ((uic) obj).h.get(i)).a;
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
                a72 a72Var = (a72) obj;
                if (i != a72Var.C0 && i != a72Var.G0 && i != a72Var.H0 && i != a72Var.D0 && i != a72Var.E0 && i != a72Var.F0 && i != a72Var.I0 && i != a72Var.N0.b && i != a72Var.O0.b) {
                    if (i == a72Var.m0 || i == a72Var.t0 || i == a72Var.x0 || i == a72Var.p0) {
                        return 0;
                    }
                    if (i == a72Var.s0) {
                        return 1;
                    }
                    if (i == a72Var.w0 || i == a72Var.y0 || i == a72Var.r0 || i == a72Var.L0) {
                        return 2;
                    }
                    if (i == a72Var.v0 || i == a72Var.J0 || i == a72Var.M0) {
                        return 3;
                    }
                    if (i == a72Var.n0) {
                        return 4;
                    }
                    if (i == a72Var.o0) {
                        return 11;
                    }
                    if (i == a72Var.q0) {
                        return 7;
                    }
                    if (i == a72Var.z0 || i == a72Var.A0 || i == a72Var.K0) {
                        return 6;
                    }
                    if (i == a72Var.B0) {
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
                if (i == DataAutoDownloadActivity.Y(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i == dataAutoDownloadActivity.s) {
                    return 1;
                }
                if (i == dataAutoDownloadActivity.r || i == dataAutoDownloadActivity.w) {
                    return 2;
                }
                if (i == DataAutoDownloadActivity.c0(dataAutoDownloadActivity)) {
                    return 3;
                }
                if (i != DataAutoDownloadActivity.a0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.d0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.Z(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.b0(dataAutoDownloadActivity)) {
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
                if (i == dataSettingsActivity.e || i == dataSettingsActivity.h || i == dataSettingsActivity.f || i == DataSettingsActivity.c0(dataSettingsActivity) || i == DataSettingsActivity.d0(dataSettingsActivity) || i == DataSettingsActivity.b0(dataSettingsActivity)) {
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
                return ik8.F(((dl4) ((ll4) obj).F.get(i)).b);
            case 7:
                th6 th6Var = (th6) obj;
                if (i == 0) {
                    return 0;
                }
                if (i == th6Var.c || i == th6Var.d || i == th6Var.e || i == th6Var.f || i == th6Var.h) {
                    return 1;
                }
                if (i == th6Var.n) {
                    return 2;
                }
                if (i != th6Var.r) {
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
                if (i != PasscodeActivity.b0(passcodeActivity) && i != passcodeActivity.O && i != passcodeActivity.L && i != passcodeActivity.K) {
                    if (i == PasscodeActivity.Z(passcodeActivity) || i == PasscodeActivity.Y(passcodeActivity) || i == PasscodeActivity.a0(passcodeActivity)) {
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
                c98 c98Var = (c98) obj;
                if (i == c98Var.E || i == c98Var.F) {
                    return 1;
                }
                return 0;
            case 12:
                l98 l98Var = (l98) obj;
                ArrayList arrayList = l98Var.f;
                if (l98Var.Z) {
                    return 2;
                }
                if (l98Var.K == null) {
                    if (arrayList.isEmpty()) {
                        if (i == l98Var.n.size()) {
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
                if (i == ProxyListActivity.Y(proxyListActivity) || i == proxyListActivity.E) {
                    return 1;
                }
                if (i == ProxyListActivity.Z(proxyListActivity) || i == proxyListActivity.w) {
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
    public final void t(defpackage.f89 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.t(f89, int):void");
    }

    @Override
    public final void u(f89 f89Var, int i, List list) {
        boolean contains;
        switch (this.c) {
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i2 = f89Var.f;
                View view = f89Var.a;
                if (i2 == 5 && !list.isEmpty()) {
                    hx8 hx8Var = (hx8) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i - proxyListActivity.n))) != hx8Var.h) {
                        hx8Var.h = contains;
                        hx8Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        hx8Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (f89Var.f == 3 && list.contains(0)) {
                    wkb wkbVar = (wkb) view;
                    if (i == ProxyListActivity.Z(proxyListActivity)) {
                        wkbVar.setChecked(proxyListActivity.d);
                        return;
                    } else if (i == proxyListActivity.w) {
                        wkbVar.setChecked(xea.W0);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(f89Var, i);
                    return;
                }
            default:
                super.u(f89Var, i, list);
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        qmb qmbVar;
        y62 mf5Var;
        zma zmaVar;
        View rcaVar;
        FrameLayout frameLayout;
        dlb dlbVar;
        View mf5Var2;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        vnb vnbVar5;
        View wkbVar;
        l88 l88Var;
        skb skbVar;
        View rcaVar2;
        FrameLayout frameLayout2;
        View ua6Var;
        byte b = this.c;
        int i2 = 8;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Context context = (Context) obj2;
                if (i == 0) {
                    qmbVar = new mf5(context);
                } else if (i == 1) {
                    qmbVar = new wkb(context);
                } else if (i == 2) {
                    qmb qmbVar2 = new qmb(context);
                    qmbVar2.setCanDisable(true);
                    qmbVar = qmbVar2;
                } else {
                    qmbVar = new ilb(context);
                }
                qmbVar.setLayoutParams(new r79(-1, -2));
                return new f89(qmbVar);
            case 1:
                Context context2 = (Context) obj2;
                a72 a72Var = (a72) obj;
                boolean z = a72Var.n;
                vnb vnbVar6 = a72Var.a;
                switch (i) {
                    case 0:
                        mf5Var = new mf5((Context) obj2, aob.L6, 21, 15, false, a72Var.a);
                        break;
                    case 1:
                        View rcaVar3 = new rca(context2, (uh9) null);
                        new zm2(new ColorDrawable(aob.v0(aob.a7, vnbVar6)), aob.W0(context2, 2131231232, aob.b7)).x = true;
                        mf5Var = rcaVar3;
                        break;
                    case 2:
                        mf5Var = new ilb(context2, vnbVar6);
                        break;
                    case 3:
                        mf5Var = new skb(context2, vnbVar6);
                        break;
                    case 4:
                    case 11:
                        v62 v62Var = new v62(this, (Context) obj2, a72Var.J ? 1 : 0, a72Var.a, i);
                        if (i == 11 && !z) {
                            v62Var.setTextRight(98);
                            v62Var.b().setOnClickListener(new View.OnClickListener(this) {
                                public final t20 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    t20 t20Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            ((a72) t20Var.e).d0(-2);
                                            return;
                                        case 1:
                                            ((a72) t20Var.e).d0(-3);
                                            return;
                                        default:
                                            ((a72) t20Var.e).W(view, (zh8) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        v62Var.e();
                        v62Var.setIconsColor(aob.o7);
                        v62Var.c(new w62(this, v62Var, i));
                        mf5Var = v62Var;
                        break;
                    case 5:
                    default:
                        y62 y62Var = new y62(this, (Context) obj2, a72Var.J ? 1 : 0, new View.OnClickListener(this) {
                            public final t20 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                byte b2 = r2;
                                t20 t20Var = this.b;
                                switch (b2) {
                                    case 0:
                                        ((a72) t20Var.e).d0(-2);
                                        return;
                                    case 1:
                                        ((a72) t20Var.e).d0(-3);
                                        return;
                                    default:
                                        ((a72) t20Var.e).W(view, (zh8) view.getParent(), true);
                                        return;
                                }
                            }
                        }, a72Var.a);
                        if (!z) {
                            y62Var.setTextRight(140);
                            y62Var.b().setOnClickListener(new sb1(this, y62Var, (byte) 12));
                        }
                        int i3 = aob.o7;
                        y62Var.setIconsColor(i3);
                        og2 og2Var = y62Var.r;
                        if (og2Var != null) {
                            og2Var.getCheckBoxBase().i(hl.L(6.0f));
                            CheckBoxBase checkBoxBase = og2Var.getCheckBoxBase();
                            float f = y62Var.a.e;
                            if (checkBoxBase.w != f) {
                                checkBoxBase.w = f;
                                checkBoxBase.b();
                            }
                        }
                        y62Var.getCheckBox().b(-1, i3, aob.k7);
                        y62Var.c(new ry(this, y62Var, (byte) 2));
                        y62Var.setShowNextButton(true);
                        EditTextBoldCursor textView = y62Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new hf(this, y62Var, (byte) 2));
                        textView.setOnKeyListener(new x6(y62Var, (byte) 2));
                        mf5Var = y62Var;
                        break;
                    case 6:
                        mf5Var = new wkb(context2, vnbVar6);
                        break;
                    case 7:
                        x62 x62Var = new x62(this, context2, a72Var.J ? 1 : 0);
                        x62Var.e();
                        if (!z) {
                            x62Var.setTextRight(98);
                            x62Var.b().setOnClickListener(new View.OnClickListener(this) {
                                public final t20 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    t20 t20Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            ((a72) t20Var.e).d0(-2);
                                            return;
                                        case 1:
                                            ((a72) t20Var.e).d0(-3);
                                            return;
                                        default:
                                            ((a72) t20Var.e).W(view, (zh8) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        x62Var.setIconsColor(aob.o7);
                        x62Var.c(new ry(this, x62Var, (byte) 1));
                        mf5Var = x62Var;
                        break;
                    case 8:
                        View t62Var = new t62(context2, (byte) 0);
                        t62Var.setTag(-33024);
                        mf5Var = t62Var;
                        break;
                    case 9:
                        View tbVar = new tb((byte) 6, context2, this);
                        tbVar.setTag(-33024);
                        mf5Var = tbVar;
                        break;
                    case 10:
                        xh8 xh8Var = new xh8(context2, vnbVar6);
                        xh8Var.getCheckBox().setIcon(2131232529);
                        mf5Var = xh8Var;
                        break;
                }
                return qu6.h(mf5Var, mf5Var, -1, -2);
            case 2:
                Context context3 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    zmaVar = new ilb(context3);
                                } else {
                                    zmaVar = new uo7(context3);
                                }
                            } else {
                                zma zmaVar2 = new zma(context3, null);
                                zmaVar2.setCallback(new ht2(this, (byte) 14));
                                zmaVar = zmaVar2;
                            }
                        } else {
                            zmaVar = new mf5(context3);
                        }
                    } else {
                        zmaVar = new rca(context3, (uh9) null);
                    }
                } else {
                    wkb wkbVar2 = new wkb(context3);
                    wkbVar2.d(aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
                    wkbVar2.setTypeface(hl.o());
                    wkbVar2.setHeight(56);
                    zmaVar = wkbVar2;
                }
                return qu6.h(zmaVar, zmaVar, -1, -2);
            case 3:
                Context context4 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        rcaVar = new skb(context4);
                                    } else {
                                        rcaVar = new uo7(context4);
                                    }
                                } else {
                                    rcaVar = new ilb(context4);
                                }
                            } else {
                                rcaVar = new wkb(context4);
                            }
                        } else {
                            rcaVar = new mf5(context4, 22);
                        }
                    } else {
                        rcaVar = new qmb(context4);
                    }
                } else {
                    rcaVar = new rca(context4, (uh9) null);
                }
                return qu6.h(rcaVar, rcaVar, -1, -2);
            case 4:
                return new f89(new dg4((fg4) obj, (Context) obj2));
            case 5:
                hx0 hx0Var = new hx0(0, null, (Activity) obj2);
                hx0Var.setBackground(null);
                hx0Var.setLayoutParams(new r79(-1, -2));
                return new f89(hx0Var);
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                int F = ik8.F(ik8.G(3)[i]);
                if (F != 1) {
                    if (F != 2) {
                        frameLayout = new bd(launchActivity, null);
                    } else {
                        ?? frameLayout3 = new FrameLayout(launchActivity);
                        frameLayout3.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout3.h = textPaint;
                        textPaint.setTextSize(hl.L(16.0f));
                        uy9 uy9Var = new uy9(launchActivity);
                        frameLayout3.a = uy9Var;
                        uy9Var.setReportChanges(true);
                        uy9Var.setDelegate(new aj3((Object) frameLayout3, (byte) 5));
                        uy9Var.setImportantForAccessibility(2);
                        frameLayout3.addView(uy9Var, tre.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout = new mf5(launchActivity);
                }
                frameLayout.setLayoutParams(new r79(-1, -2));
                return new f89(frameLayout);
            case 7:
                Context context5 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                dlbVar = new ilb(context5);
                            } else {
                                View qmbVar3 = new qmb(context5);
                                yob.h(aob.d6, null, qmbVar3);
                                dlbVar = qmbVar3;
                            }
                        } else {
                            dlbVar = new rca(context5, (uh9) null);
                        }
                    } else {
                        dlb dlbVar2 = new dlb(context5);
                        dlbVar2.setMultilineDetail(true);
                        yob.h(aob.d6, null, dlbVar2);
                        dlbVar = dlbVar2;
                    }
                } else {
                    View mf5Var3 = new mf5(context5);
                    yob.h(aob.d6, null, mf5Var3);
                    dlbVar = mf5Var3;
                }
                return qu6.h(dlbVar, dlbVar, -1, -2);
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context6 = (Context) obj2;
                if (i == 0) {
                    vnbVar = ((e) notificationsSettingsActivity).resourceProvider;
                    mf5Var2 = new mf5(context6, vnbVar);
                } else if (i == 1) {
                    vnbVar2 = ((e) notificationsSettingsActivity).resourceProvider;
                    mf5Var2 = new wkb(context6, vnbVar2);
                } else if (i != 2) {
                    if (i == 3) {
                        vnbVar3 = ((e) notificationsSettingsActivity).resourceProvider;
                        mf5Var2 = new uo7((Context) obj2, 21, 64, true, vnbVar3);
                    } else if (i != 4) {
                        if (i != 5) {
                            vnbVar5 = ((e) notificationsSettingsActivity).resourceProvider;
                            mf5Var2 = new ilb(context6, vnbVar5);
                        } else {
                            vnbVar4 = ((e) notificationsSettingsActivity).resourceProvider;
                            mf5Var2 = new qmb(0, vnbVar4, context6);
                        }
                    } else {
                        mf5Var2 = new rca(context6, (uh9) null);
                    }
                } else {
                    mf5Var2 = new dlb(context6);
                }
                return new f89(mf5Var2);
            case 9:
                Context context7 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                wkbVar = new ilb(context7);
                            } else {
                                wkbVar = new sy7(context7);
                                wkbVar.setTag(-33024);
                            }
                        } else {
                            wkbVar = new mf5(context7);
                        }
                    } else {
                        wkbVar = new qmb(context7);
                    }
                } else {
                    wkbVar = new wkb(context7);
                }
                return new f89(wkbVar);
            case 10:
                Context context8 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context8);
                frameLayout4.e = new Paint();
                frameLayout4.b = new do6[4];
                frameLayout4.a = new m98[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    frameLayout4.a[i4] = new m98((o98) frameLayout4, context8);
                    frameLayout4.addView(frameLayout4.a[i4]);
                    frameLayout4.a[i4].setVisibility(4);
                    frameLayout4.a[i4].setTag(Integer.valueOf(i4));
                    frameLayout4.a[i4].setOnClickListener(new am7(frameLayout4, (byte) 15));
                }
                frameLayout4.setDelegate(new jz7(this, (byte) 3));
                return new f89(frameLayout4);
            case 11:
                Context context9 = (Context) obj2;
                if (i == 0) {
                    vnb vnbVar7 = ((c98) obj).J0;
                    ?? frameLayout5 = new FrameLayout(context9);
                    frameLayout5.e = new ki7(frameLayout5, (byte) 7);
                    TextView textView2 = new TextView(context9);
                    frameLayout5.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout5.addView(textView2, tre.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context9);
                    frameLayout5.b = textView3;
                    yob.X(textView3, aob.qg, vnbVar7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout5.addView(textView3, tre.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view = new View(context9);
                    Paint paint = new Paint();
                    view.a = paint;
                    Paint paint2 = new Paint(1);
                    view.b = paint2;
                    view.c = hl.L(16.0f);
                    view.d = 0;
                    view.e = 0.0f;
                    view.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout5.c = view;
                    frameLayout5.addView(view, tre.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout5.setSeekBarDelegate(new jz7(this, (byte) 4));
                    l88Var = frameLayout5;
                } else {
                    l88 l88Var2 = new l88(context9);
                    l88Var2.setOnClickListener(new am7(this, (byte) 13));
                    l88Var = l88Var2;
                }
                return new f89(l88Var);
            case 12:
                l98 l98Var = (l98) obj;
                boolean z2 = l98Var.s0;
                Context context10 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                hp3 hp3Var = new hp3(context10, null);
                                hp3Var.setForceDarkTheme(z2);
                                skbVar = hp3Var;
                            } else {
                                skb skbVar2 = new skb(23, context10, true);
                                skbVar2.setLayoutParams(new r79(-1, -2));
                                skbVar = skbVar2;
                                if (z2) {
                                    yob.W(skbVar2.a, l98Var.w0, null);
                                    yob.s(skbVar2.e, aob.ih, null, PorterDuff.Mode.MULTIPLY);
                                    skbVar = skbVar2;
                                }
                            }
                        } else {
                            skbVar = new zea(1, null, context10);
                        }
                    } else {
                        ViewGroup frameLayout6 = new FrameLayout(context10);
                        frameLayout6.setLayoutParams(new r79(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context10, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout6.addView(radialProgressView, tre.c(-1.0f, -1));
                        skbVar = frameLayout6;
                    }
                } else {
                    d88 d88Var = new d88(context10, null);
                    d88Var.setDelegate(new i98(this));
                    FrameLayout checkFrame = d88Var.getCheckFrame();
                    if (l98Var.U == 0) {
                        i2 = 0;
                    }
                    checkFrame.setVisibility(i2);
                    skbVar = d88Var;
                }
                return new f89(skbVar);
            case 13:
                Context context11 = (Context) obj2;
                ?? frameLayout7 = new FrameLayout(context11);
                frameLayout7.setWillNotDraw(false);
                de0 de0Var = new de0(context11);
                frameLayout7.a = de0Var;
                de0Var.setRoundRadius(hl.L(4.0f));
                frameLayout7.addView(de0Var, tre.c(-1.0f, -1));
                FrameLayout frameLayout8 = new FrameLayout(context11);
                frameLayout7.b = frameLayout8;
                frameLayout7.addView(frameLayout8, tre.e(42, 42, 53));
                jo0 jo0Var = new jo0(context11);
                jo0Var.c = new Path();
                jo0Var.b = new float[8];
                jo0Var.d = new RectF();
                jo0Var.e = new Paint(1);
                frameLayout7.e = jo0Var;
                jo0Var.setWillNotDraw(false);
                jo0Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
                frameLayout7.addView(jo0Var, tre.e(-1, 16, 83));
                jo0Var.addView(qd4.k(context11, 2131231466), tre.e(-2, -2, 19));
                TextView textView4 = new TextView(context11);
                frameLayout7.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                jo0Var.addView(textView4, tre.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                og2 og2Var2 = new og2(24, null, context11);
                frameLayout7.c = og2Var2;
                og2Var2.setDrawBackgroundAsArc(11);
                og2Var2.b(aob.W9, aob.X9, aob.V9);
                frameLayout7.addView(og2Var2, tre.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                og2Var2.setVisibility(0);
                frameLayout7.setFocusable(true);
                frameLayout8.setOnClickListener(new am7(this, (byte) 17));
                return new f89(frameLayout7);
            case 14:
                Context context12 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 6) {
                                        rcaVar2 = new hx8((ProxyListActivity) obj, context12);
                                        yob.h(aob.d6, null, rcaVar2);
                                    } else {
                                        rcaVar2 = new zma(context12, null);
                                        yob.h(aob.d6, null, rcaVar2);
                                    }
                                } else {
                                    rcaVar2 = new ilb(context12);
                                }
                            } else {
                                rcaVar2 = new wkb(context12);
                                yob.h(aob.d6, null, rcaVar2);
                            }
                        } else {
                            rcaVar2 = new mf5(context12);
                            yob.h(aob.d6, null, rcaVar2);
                        }
                    } else {
                        rcaVar2 = new qmb(context12);
                        yob.h(aob.d6, null, rcaVar2);
                    }
                } else {
                    rcaVar2 = new rca(context12, (uh9) null);
                }
                return qu6.h(rcaVar2, rcaVar2, -1, -2);
            case 15:
                Context context13 = (Context) obj2;
                dka dkaVar = (dka) obj;
                if (i != 0) {
                    FrameLayout ir8Var = new ir8(context13, (byte) 8);
                    ir8Var.setWillNotDraw(false);
                    TextView textView5 = new TextView(context13);
                    dkaVar.o1 = textView5;
                    yob.X(textView5, aob.J5, dkaVar.J0);
                    dkaVar.o1.setTextSize(1, 14.0f);
                    dkaVar.o1.setGravity(17);
                    dkaVar.o1.setPadding(0, 0, 0, hl.L(8.0f));
                    ir8Var.addView(dkaVar.o1, tre.c(40.0f, -1));
                    frameLayout2 = ir8Var;
                } else {
                    frameLayout2 = new aka(54, dkaVar.J0, context13, false);
                }
                return new f89(frameLayout2);
            case 16:
                return new f89(new yeb((zeb) obj, ((zeb) obj2).getContext()));
            case 17:
                Context context14 = (Context) obj2;
                if (i == 0) {
                    ua6Var = new of3(context14, false);
                } else {
                    ua6Var = new ua6(context14);
                }
                ua6Var.setLayoutParams(new r79(-1, -2));
                return new f89(ua6Var);
            default:
                return new f89(new sic((uic) obj, (Context) obj2));
        }
    }

    @Override
    public final void y(f89 f89Var) {
        int i;
        int i2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 1:
                a72 a72Var = (a72) obj;
                ih8 ih8Var = a72Var.n1;
                boolean z = a72Var.n;
                int i3 = f89Var.f;
                View view = f89Var.a;
                CharSequence charSequence = "";
                if (i3 == 4) {
                    zh8 zh8Var = (zh8) view;
                    zh8Var.setTag(1);
                    CharSequence charSequence2 = a72Var.O;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z) {
                        i2 = 2131743706;
                    } else {
                        i2 = 2131746175;
                    }
                    zh8Var.o(charSequence, ob6.M0(i2, null), true);
                    zh8Var.setTag(null);
                    a72Var.h0(f89Var.b(), view);
                    return;
                } else if (i3 == 11) {
                    zh8 zh8Var2 = (zh8) view;
                    zh8Var2.setTag(1);
                    CharSequence charSequence3 = a72Var.P;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    zh8Var2.o(charSequence, ob6.M0(2131746176, null), false);
                    zh8Var2.setTag(null);
                    zh8Var2.e.a(ih8Var.b(-2), false);
                    a72Var.h0(f89Var.b(), view);
                    return;
                } else if (i3 == 5) {
                    int b2 = f89Var.b();
                    zh8 zh8Var3 = (zh8) view;
                    zh8Var3.setTag(1);
                    zh8Var3.a.a(a72Var.c0, false);
                    int i4 = b2 - a72Var.u0;
                    CharSequence charSequence4 = a72Var.L[i4];
                    if (z) {
                        i = 2131743708;
                    } else {
                        i = 2131747501;
                    }
                    zh8Var3.o(charSequence4, ob6.M0(i, null), true);
                    zh8Var3.setTag(null);
                    if (a72Var.l0 == b2) {
                        EditTextBoldCursor textView = zh8Var3.getTextView();
                        textView.requestFocus();
                        hl.E3(textView);
                        a72Var.l0 = -1;
                    }
                    if (!z) {
                        zh8Var3.e.a(ih8Var.b(i4), false);
                    }
                    a72Var.h0(b2, view);
                    return;
                } else if (i3 == 7) {
                    zh8 zh8Var4 = (zh8) view;
                    zh8Var4.setTag(1);
                    CharSequence charSequence5 = a72Var.Q;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    zh8Var4.o(charSequence, ob6.M0(2131754467, null), false);
                    zh8Var4.setTag(null);
                    if (!z) {
                        zh8Var4.e.a(ih8Var.b(-3), false);
                    }
                    a72Var.h0(f89Var.b(), view);
                    return;
                } else {
                    return;
                }
            case 3:
                if (f89Var.f == 3) {
                    wkb wkbVar = (wkb) f89Var.a;
                    int b3 = f89Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b3 == dataSettingsActivity.F) {
                        wkbVar.setChecked(xea.A0);
                        return;
                    } else if (b3 == dataSettingsActivity.E) {
                        wkbVar.setChecked(xea.x0);
                        return;
                    } else if (b3 == dataSettingsActivity.G) {
                        wkbVar.setChecked(xea.y0);
                        return;
                    } else if (b3 == dataSettingsActivity.H) {
                        wkbVar.setChecked(xea.z0);
                        return;
                    } else if (b3 == dataSettingsActivity.K) {
                        boolean z2 = xea.a;
                        wkbVar.setChecked(i86.e(2048));
                        return;
                    } else if (b3 == dataSettingsActivity.L) {
                        boolean z3 = xea.a;
                        wkbVar.setChecked(i86.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (f89Var.f == 3) {
                    wkb wkbVar2 = (wkb) f89Var.a;
                    int b4 = f89Var.b();
                    if (b4 == ProxyListActivity.Z(proxyListActivity)) {
                        wkbVar2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b4 == proxyListActivity.w) {
                        wkbVar2.setChecked(xea.W0);
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
    public final void z(f89 f89Var) {
        switch (this.c) {
            case 1:
                a72 a72Var = (a72) this.e;
                int i = f89Var.f;
                if (i == 4 || i == 11 || i == 5) {
                    EditTextBoldCursor textView = ((zh8) f89Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (a72Var.J) {
                            s62 s62Var = a72Var.y;
                            if (s62Var != null) {
                                s62Var.e();
                            }
                            a72Var.Y(true);
                        }
                        a72Var.h1 = null;
                        textView.clearFocus();
                        hl.t1(textView);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public t20(ll4 ll4Var, LaunchActivity launchActivity) {
        this.c = (byte) 6;
        this.e = ll4Var;
        this.d = launchActivity;
    }

    public t20(Object obj, Object obj2, byte b) {
        this.c = b;
        this.e = obj;
        this.d = obj2;
    }

    public t20(ProxyListActivity proxyListActivity, Context context) {
        this.c = (byte) 14;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
