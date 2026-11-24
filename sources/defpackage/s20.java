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
public final class s20 extends n39 {
    public final byte c;
    public final Object d;
    public final Object e;

    public s20(Context context) {
        this.c = (byte) 17;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        pe3 pe3Var = new pe3();
        pe3Var.a = k96.M0(2131743930, null);
        pe3Var.b = k96.M0(2131743922, null);
        pe3Var.c = (byte) 0;
        pe3Var.d = (byte) 0;
        pe3Var.e = true;
        pe3Var.f = false;
        pe3Var.g = (byte) 0;
        pe3Var.h = currentTimeMillis;
        pe3Var.i = false;
        pe3Var.j = false;
        pe3Var.k = 2;
        arrayList.add(pe3Var);
        pe3 pe3Var2 = new pe3();
        pe3Var2.a = k96.M0(2131743929, null);
        pe3Var2.b = k96.M0(2131743921, null);
        pe3Var2.c = (byte) 1;
        pe3Var2.d = (byte) 2;
        pe3Var2.e = false;
        pe3Var2.f = false;
        pe3Var2.g = (byte) 0;
        pe3Var2.h = currentTimeMillis - 3600;
        pe3Var2.i = false;
        pe3Var2.j = false;
        pe3Var2.k = -1;
        arrayList.add(pe3Var2);
        pe3 pe3Var3 = new pe3();
        pe3Var3.a = k96.M0(2131743928, null);
        pe3Var3.b = k96.M0(2131743920, null);
        pe3Var3.c = (byte) 2;
        pe3Var3.d = (byte) 3;
        pe3Var3.e = false;
        pe3Var3.f = true;
        pe3Var3.g = (byte) 0;
        pe3Var3.h = currentTimeMillis - 7200;
        pe3Var3.i = false;
        pe3Var3.j = true;
        pe3Var3.k = -1;
        arrayList.add(pe3Var3);
        pe3 pe3Var4 = new pe3();
        pe3Var4.a = k96.M0(2131743927, null);
        pe3Var4.b = k96.M0(2131743919, null);
        pe3Var4.c = (byte) 3;
        pe3Var4.d = (byte) 0;
        pe3Var4.e = false;
        pe3Var4.f = false;
        pe3Var4.g = (byte) 2;
        pe3Var4.h = currentTimeMillis - 10800;
        pe3Var4.i = false;
        pe3Var4.j = false;
        pe3Var4.k = -1;
        arrayList.add(pe3Var4);
        pe3 pe3Var5 = new pe3();
        pe3Var5.a = k96.M0(2131743926, null);
        pe3Var5.b = k96.M0(2131743918, null);
        pe3Var5.c = (byte) 4;
        pe3Var5.d = (byte) 0;
        pe3Var5.e = false;
        pe3Var5.f = false;
        pe3Var5.g = (byte) 1;
        pe3Var5.h = currentTimeMillis - 14400;
        pe3Var5.i = false;
        pe3Var5.j = false;
        pe3Var5.k = 2;
        arrayList.add(pe3Var5);
        pe3 pe3Var6 = new pe3();
        pe3Var6.a = k96.M0(2131743925, null);
        pe3Var6.b = k96.M0(2131743917, null);
        pe3Var6.c = (byte) 5;
        pe3Var6.d = (byte) 0;
        pe3Var6.e = false;
        pe3Var6.f = false;
        pe3Var6.g = (byte) 0;
        pe3Var6.h = currentTimeMillis - 18000;
        pe3Var6.i = false;
        pe3Var6.j = false;
        pe3Var6.k = -1;
        arrayList.add(pe3Var6);
        pe3 pe3Var7 = new pe3();
        pe3Var7.a = k96.M0(2131743924, null);
        pe3Var7.b = k96.M0(2131743916, null);
        pe3Var7.c = (byte) 6;
        pe3Var7.d = (byte) 0;
        pe3Var7.e = false;
        pe3Var7.f = false;
        pe3Var7.g = (byte) 0;
        pe3Var7.h = currentTimeMillis - 21600;
        pe3Var7.i = true;
        pe3Var7.j = false;
        pe3Var7.k = -1;
        arrayList.add(pe3Var7);
        pe3 pe3Var8 = new pe3();
        pe3Var8.a = k96.M0(2131743923, null);
        pe3Var8.b = k96.M0(2131743915, null);
        pe3Var8.c = (byte) 0;
        pe3Var8.d = (byte) 0;
        pe3Var8.e = false;
        pe3Var8.f = false;
        pe3Var8.g = (byte) 0;
        pe3Var8.h = currentTimeMillis - 25200;
        pe3Var8.i = true;
        pe3Var8.j = false;
        pe3Var8.k = -1;
        arrayList.add(pe3Var8);
    }

    private final void G(defpackage.s49 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s20.G(s49, int):void");
    }

    private final void H(s49 s49Var, int i) {
        String a0;
        PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            lv7 lv7Var = (lv7) view;
                            lv7Var.a.f(2131624320, 100, 100, null);
                            lv7Var.a.d();
                            return;
                        }
                        return;
                    }
                    ld5 ld5Var = (ld5) view;
                    ld5Var.setHeight(46);
                    if (i == passcodeActivity.N) {
                        ld5Var.setText(k96.M0(2131745651, null));
                        return;
                    } else if (i == passcodeActivity.J) {
                        ld5Var.setText(k96.M0(2131742835, null));
                        return;
                    } else {
                        return;
                    }
                }
                mhb mhbVar = (mhb) view;
                if (i == passcodeActivity.H) {
                    mhbVar.setText(k96.M0(2131747462, null));
                    mhbVar.setBackground(null);
                    mhbVar.getTextView().setGravity(1);
                    return;
                } else if (i == passcodeActivity.I) {
                    mhbVar.setText(k96.M0(2131753794, null));
                    l46 textView = mhbVar.getTextView();
                    if (k96.a0) {
                        i3 = 5;
                    }
                    textView.setGravity(i3);
                    return;
                } else if (i == passcodeActivity.M) {
                    mhbVar.setText(k96.M0(2131742834, null));
                    l46 textView2 = mhbVar.getTextView();
                    if (k96.a0) {
                        i3 = 5;
                    }
                    textView2.setGravity(i3);
                    return;
                } else if (i == passcodeActivity.P) {
                    mhbVar.setText(k96.M0(2131745650, null));
                    l46 textView3 = mhbVar.getTextView();
                    if (k96.a0) {
                        i3 = 5;
                    }
                    textView3.setGravity(i3);
                    return;
                } else {
                    return;
                }
            }
            uib uibVar = (uib) view;
            if (i == PasscodeActivity.b0(passcodeActivity)) {
                uibVar.b(k96.M0(2131752532, null), true);
                if (gba.r.isEmpty()) {
                    int i4 = bkb.D6;
                    uibVar.setTag(Integer.valueOf(i4));
                    zkb.X(uibVar.getTextView(), i4, null);
                    return;
                }
                int i5 = bkb.F6;
                uibVar.setTag(Integer.valueOf(i5));
                zkb.X(uibVar.getTextView(), i5, null);
                return;
            } else if (i == PasscodeActivity.a0(passcodeActivity)) {
                int i6 = gba.x;
                if (i6 == 0) {
                    a0 = k96.a0("AutoLockDisabled", null, 2131753796, new Object[0]);
                } else if (i6 < 3600) {
                    a0 = k96.a0("AutoLockInTime", null, 2131753795, k96.G(i6 / 60, "Minutes", new Object[0]));
                } else if (i6 < 86400) {
                    a0 = k96.a0("AutoLockInTime", null, 2131753795, k96.G((int) Math.ceil((i6 / 60.0f) / 60.0f), "Hours", new Object[0]));
                } else {
                    a0 = k96.a0("AutoLockInTime", null, 2131753795, k96.G((int) Math.ceil(((i6 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                }
                uibVar.c(k96.M0(2131753797, null), a0, false, true);
                int i7 = bkb.F6;
                uibVar.setTag(Integer.valueOf(i7));
                zkb.X(uibVar.getTextView(), i7, null);
                return;
            } else if (i == PasscodeActivity.c0(passcodeActivity)) {
                uibVar.b(k96.M0(2131751421, null), false);
                int i8 = bkb.p7;
                uibVar.setTag(Integer.valueOf(i8));
                zkb.X(uibVar.getTextView(), i8, null);
                return;
            } else {
                return;
            }
        }
        ahb ahbVar = (ahb) view;
        if (i == PasscodeActivity.Z(passcodeActivity)) {
            ahbVar.f(k96.M0(2131743634, null), gba.C, false);
        } else if (i == passcodeActivity.O) {
            ahbVar.f(k96.M0(2131745649, null), gba.z, false);
        } else if (i == passcodeActivity.L) {
            String M0 = k96.M0(2131742923, null);
            if (!c.C(PasscodeActivity.e0(passcodeActivity)).e() || !c.C(PasscodeActivity.f0(passcodeActivity)).Q()) {
                z = false;
            }
            ahbVar.f(M0, z, false);
        } else if (i == passcodeActivity.K) {
            ahbVar.f(k96.M0(2131742922, null), c.C(PasscodeActivity.g0(passcodeActivity)).R(), false);
        }
    }

    private final void I(s49 s49Var, int i) {
        l58 l58Var = (l58) this.e;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                w48 w48Var = (w48) view;
                w48Var.setTag(Integer.valueOf(i));
                if (i == l58Var.E) {
                    w48Var.a(l58Var.O, k96.M0(2131743873, null));
                    return;
                } else if (i == l58Var.F) {
                    w48Var.a(l58Var.P, k96.M0(2131743874, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        x48 x48Var = (x48) view;
        x48Var.setTag(Integer.valueOf(i));
        if (i == l58Var.b) {
            x48Var.a(k96.M0(2131751114, null), 0, l58Var.H);
        } else if (i == l58Var.r) {
            x48Var.a(k96.M0(2131749110, null), -100, l58Var.Q);
        } else if (i == l58Var.d) {
            x48Var.a(k96.M0(2131751757, null), -100, l58Var.J);
        } else if (i == l58Var.c) {
            x48Var.a(k96.M0(2131750845, null), -100, l58Var.I);
        } else if (i == l58Var.f) {
            x48Var.a(k96.M0(2131742686, null), -100, l58Var.K);
        } else if (i == l58Var.e) {
            x48Var.a(k96.M0(2131745755, null), -100, l58Var.L);
        } else if (i == l58Var.w) {
            x48Var.a(k96.M0(2131743282, null), 0, l58Var.S);
        } else if (i == l58Var.s) {
            x48Var.a(k96.M0(2131745273, null), -100, l58Var.R);
        } else if (i == l58Var.x) {
            x48Var.a(k96.M0(2131749349, null), 0, l58Var.T);
        } else if (i == l58Var.y) {
            x48Var.a(k96.M0(2131745175, null), 0, l58Var.V);
        } else if (i == l58Var.h) {
            x48Var.a(k96.M0(2131750834, null), 0, l58Var.M);
        } else if (i == l58Var.n) {
            x48Var.a(k96.M0(2131745101, null), 0, l58Var.N);
        }
    }

    private final void J(s49 s49Var, int i) {
        boolean P0;
        boolean z;
        u58 u58Var = (u58) this.e;
        xl6 xl6Var = u58Var.K;
        ArrayList arrayList = u58Var.n;
        ArrayList arrayList2 = u58Var.c;
        HashMap hashMap = u58Var.b;
        int i2 = s49Var.f;
        View view = s49Var.a;
        int i3 = -1;
        int i4 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        wgb wgbVar = (wgb) view;
                        if (i < arrayList.size()) {
                            wgbVar.o(2131232332, (CharSequence) arrayList.get(i), false);
                            return;
                        } else {
                            wgbVar.o(2131232099, k96.M0(2131752055, null), false);
                            return;
                        }
                    }
                    return;
                }
                jm6 jm6Var = (jm6) xl6Var.e.get(i);
                iba ibaVar = (iba) view;
                ibaVar.setPhotoEntry(jm6Var);
                ibaVar.b(hashMap.containsKey(Integer.valueOf(jm6Var.C)), false);
                ibaVar.setTag(Integer.valueOf(i));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = u58Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        o48 o48Var = (o48) view;
        o48Var.setItemSize(u58Var.S);
        be0 imageView = o48Var.getImageView();
        o48Var.setTag(Integer.valueOf(i));
        imageView.q();
        if (xl6Var != null) {
            jm6 jm6Var2 = (jm6) xl6Var.e.get(i);
            if (arrayList2.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            o48Var.d(jm6Var2, z, true, false, false);
            int i5 = jm6Var2.C;
            if (u58Var.e) {
                i3 = arrayList2.indexOf(Integer.valueOf(i5));
            }
            o48Var.b(i3, hashMap.containsKey(Integer.valueOf(i5)), false);
            P0 = PhotoViewer.P0(jm6Var2.I);
        } else {
            nm6 nm6Var = (nm6) u58Var.f.get(i);
            o48Var.e(nm6Var);
            o48Var.getVideoInfoContainer().setVisibility(4);
            if (u58Var.e) {
                i3 = arrayList2.indexOf(nm6Var.B);
            }
            o48Var.b(i3, hashMap.containsKey(nm6Var.B), false);
            P0 = PhotoViewer.P0(nm6Var.g());
        }
        imageView.getImageReceiver().v0(!P0, true);
        o48Var.getCheckBox().setVisibility((u58Var.U != 0 || P0) ? 8 : 8);
    }

    private final void K(s49 s49Var, int i) {
        int i2;
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        y58 y58Var = (y58) s49Var.a;
        int L = gl.L(85.0f);
        if (i != 0) {
            i2 = gl.L(6.0f);
        } else {
            i2 = 0;
        }
        y58Var.f = L;
        wf2 wf2Var = y58Var.c;
        be0 be0Var = y58Var.a;
        jo0 jo0Var = y58Var.e;
        y58Var.h = i2;
        ((FrameLayout.LayoutParams) y58Var.b.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) be0Var.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) jo0Var.getLayoutParams()).rightMargin = i2;
        be0Var.q();
        Object obj = photoViewer.d.u().get(photoViewer.d.d().get(i));
        if (obj instanceof jm6) {
            jm6 jm6Var = (jm6) obj;
            int i3 = jm6Var.C;
            String str = jm6Var.I;
            y58Var.setTag(jm6Var);
            jo0Var.setVisibility(4);
            String str2 = jm6Var.c;
            if (str2 != null) {
                be0Var.o(str2, null, context.getResources().getDrawable(2131232455));
            } else if (str != null) {
                be0Var.r(jm6Var.J, jm6Var.K, true);
                if (jm6Var.b && !jm6Var.d()) {
                    jo0Var.setVisibility(0);
                    y58Var.d.setText(gl.g0(jm6Var.E, false, false));
                    be0Var.o("vthumb://" + i3 + ":" + str, null, context.getResources().getDrawable(2131232455));
                } else {
                    be0Var.o(mue.d("thumb://", i3, ":", str), null, context.getResources().getDrawable(2131232455));
                }
            } else {
                be0Var.setImageResource(2131232455);
            }
            wf2Var.a.f(-1, true, false);
            wf2Var.setVisibility(0);
        } else if (obj instanceof nm6) {
            nm6 nm6Var = (nm6) obj;
            y58Var.setTag(nm6Var);
            y58Var.setImage(nm6Var);
            jo0Var.setVisibility(4);
            wf2Var.a.f(-1, true, false);
            wf2Var.setVisibility(0);
        }
    }

    private final void L(s49 s49Var, int i) {
        boolean z;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z2 = true;
        switch (i2) {
            case 1:
                uib uibVar = (uib) view;
                zkb.X(uibVar.getTextView(), bkb.F6, null);
                if (i == ProxyListActivity.c0(proxyListActivity)) {
                    String M0 = k96.M0(2131754388, null);
                    if (proxyListActivity.E == -1) {
                        z2 = false;
                    }
                    uibVar.b(M0, z2);
                    return;
                } else if (i == proxyListActivity.E) {
                    zkb.X(uibVar.getTextView(), bkb.o7, null);
                    uibVar.b(k96.M0(2131751568, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                ld5 ld5Var = (ld5) view;
                if (i == proxyListActivity.h) {
                    ld5Var.setText(k96.M0(2131746412, null));
                    return;
                }
                return;
            case 3:
                ahb ahbVar = (ahb) view;
                if (i == ProxyListActivity.d0(proxyListActivity)) {
                    String M02 = k96.M0(2131743544, null);
                    boolean z3 = proxyListActivity.d;
                    if (proxyListActivity.w == -1) {
                        z2 = false;
                    }
                    ahbVar.f(M02, z3, z2);
                    return;
                } else if (i == proxyListActivity.w) {
                    ahbVar.f(k96.M0(2131743546, null), gba.X0, true);
                    return;
                } else {
                    return;
                }
            case 4:
                mhb mhbVar = (mhb) view;
                if (i == proxyListActivity.y) {
                    mhbVar.setText(k96.M0(2131746410, null));
                    return;
                }
                return;
            case 5:
                yt8 yt8Var = (yt8) view;
                fba fbaVar = (fba) arrayList2.get(i - proxyListActivity.n);
                yt8Var.setProxy(fbaVar);
                if (gba.y1 == fbaVar) {
                    z = true;
                } else {
                    z = false;
                }
                yt8Var.setChecked(z);
                boolean contains = arrayList.contains(arrayList2.get(i - proxyListActivity.n));
                yt8Var.h = contains;
                yt8Var.f.a(contains, false);
                yt8Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i == proxyListActivity.x) {
                    fja fjaVar = (fja) view;
                    ArrayList arrayList3 = new ArrayList(zt8.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        strArr[i3] = k96.a0(null, null, 2131746409, arrayList3.get(i3));
                    }
                    fjaVar.setCallback(new sc8((byte) 7));
                    fjaVar.b(gba.Y0, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void M(s49 s49Var, int i) {
        TextView textView;
        kga kgaVar = (kga) this.e;
        int i2 = s49Var.f;
        if (i2 != 0) {
            if (i2 == 1 && (textView = kgaVar.o1) != null) {
                textView.setText(k96.a0("SharingLiveLocationTitle", null, 2131745200, k96.G(eb6.g(), "Chats", new Object[0])));
                return;
            }
            return;
        }
        ((hga) s49Var.a).setDialog(kga.D0(i - 1));
    }

    private final void N(s49 s49Var, int i) {
        String str;
        cbb cbbVar = (cbb) s49Var.a;
        dbb dbbVar = (dbb) this.d;
        ArrayList arrayList = dbbVar.x;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((dq6) arrayList.get(i)).a;
        }
        int direction = dbbVar.getDirection();
        int i2 = cbb.h;
        cbbVar.a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = cbbVar.b;
                if (!(drawable instanceof vl) || ((vl) drawable).h() != parseLong) {
                    cbbVar.setImageDrawable(vl.m(y6c.t0, parseLong, null, cbbVar.f.c()));
                }
            } catch (Exception unused) {
                cbbVar.setImageDrawable(null);
            }
        } else {
            cbbVar.setImageDrawable(vu3.f(str));
        }
        if (cbbVar.d != direction) {
            cbbVar.d = direction;
            cbbVar.requestLayout();
        }
    }

    private final void O(s49 s49Var, int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (s49Var.f == 0) {
            ue3 ue3Var = (ue3) s49Var.a;
            boolean z = true;
            if (i == arrayList.size() - 1) {
                z = false;
            }
            ue3Var.t2 = z;
            ue3Var.setDialog((pe3) arrayList.get(i));
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                int b2 = s49Var.b();
                if (b2 != 1 && (!MediaController.r0(vl9.Y((vl9) obj)) || b2 != 2)) {
                    return false;
                }
                return true;
            case 1:
                int b3 = s49Var.b();
                k62 k62Var = (k62) obj;
                if (b3 != k62Var.v0 && b3 != k62Var.H0 && b3 != k62Var.C0 && b3 != k62Var.G0 && b3 != k62Var.D0 && b3 != k62Var.I0 && b3 != k62Var.E0 && b3 != k62Var.F0 && b3 != k62Var.J0 && b3 != k62Var.K0 && b3 != k62Var.O0.b && b3 != k62Var.N0.b && b3 != k62Var.M0) {
                    return false;
                }
                return true;
            case 2:
                int b4 = s49Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj;
                if (b4 != DataAutoDownloadActivity.j0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.k0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.c0(dataAutoDownloadActivity) && b4 != DataAutoDownloadActivity.l0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 3:
                int b5 = s49Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                if (b5 != dataSettingsActivity.e && b5 != dataSettingsActivity.f && b5 != dataSettingsActivity.h && b5 != dataSettingsActivity.s && b5 != DataSettingsActivity.Z(dataSettingsActivity) && b5 != dataSettingsActivity.w && b5 != DataSettingsActivity.a0(dataSettingsActivity) && b5 != DataSettingsActivity.b0(dataSettingsActivity) && b5 != dataSettingsActivity.F && b5 != dataSettingsActivity.E && b5 != dataSettingsActivity.G && b5 != dataSettingsActivity.H && b5 != dataSettingsActivity.L && b5 != dataSettingsActivity.K && b5 != dataSettingsActivity.n && b5 != DataSettingsActivity.e0(dataSettingsActivity) && b5 != DataSettingsActivity.c0(dataSettingsActivity) && b5 != DataSettingsActivity.g0(dataSettingsActivity) && b5 != DataSettingsActivity.Y(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 4:
            case 5:
                return true;
            case 6:
                if (ug8.G(3)[s49Var.f] != 1) {
                    return false;
                }
                return true;
            case 7:
                int b6 = s49Var.b();
                pf6 pf6Var = (pf6) obj;
                if (b6 != pf6Var.c && b6 != pf6Var.d && b6 != pf6Var.e && b6 != pf6Var.f && b6 != pf6Var.h && b6 != pf6Var.r) {
                    return false;
                }
                return true;
            case 8:
                int b7 = s49Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (b7 == notificationsSettingsActivity.y || b7 == notificationsSettingsActivity.E || b7 == notificationsSettingsActivity.F || b7 == notificationsSettingsActivity.L || b7 == notificationsSettingsActivity.N || b7 == notificationsSettingsActivity.T || b7 == notificationsSettingsActivity.O || b7 == notificationsSettingsActivity.M || b7 == notificationsSettingsActivity.S || b7 == notificationsSettingsActivity.G || b7 == notificationsSettingsActivity.H || b7 == notificationsSettingsActivity.P || b7 == notificationsSettingsActivity.r || b7 == notificationsSettingsActivity.s || b7 == notificationsSettingsActivity.U || b7 == notificationsSettingsActivity.K) {
                    return false;
                }
                return true;
            case 9:
                int b8 = s49Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (b8 != PasscodeActivity.Z(passcodeActivity) && b8 != PasscodeActivity.a0(passcodeActivity) && b8 != passcodeActivity.O && b8 != PasscodeActivity.b0(passcodeActivity) && b8 != PasscodeActivity.c0(passcodeActivity) && b8 != passcodeActivity.K && b8 != passcodeActivity.L) {
                    return false;
                }
                return true;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                u58 u58Var = (u58) obj;
                if (u58Var.K == null) {
                    if (TextUtils.isEmpty(u58Var.w)) {
                        if (s49Var.f != 3) {
                            return false;
                        }
                    } else if (s49Var.b() >= u58Var.f.size()) {
                        return false;
                    }
                }
                return true;
            case 13:
                return false;
            case 14:
                int b9 = s49Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (b9 != ProxyListActivity.d0(proxyListActivity) && b9 != proxyListActivity.w && b9 != ProxyListActivity.c0(proxyListActivity) && b9 != proxyListActivity.E && (b9 < proxyListActivity.n || b9 >= proxyListActivity.r)) {
                    return false;
                }
                return true;
            case 15:
                if (s49Var.f != 0) {
                    return false;
                }
                return true;
            case 16:
                return true;
            case 17:
                if (s49Var.f == 1) {
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
        boolean x = ProxyListActivity.Y(proxyListActivity).x();
        if (size > 0) {
            ProxyListActivity.Z(proxyListActivity).F(size, x);
            if (!x) {
                ProxyListActivity.a0(proxyListActivity).J();
                int i = proxyListActivity.n;
                n(i, proxyListActivity.r - i, 2);
            }
        } else if (x) {
            ProxyListActivity.b0(proxyListActivity).w();
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
            fba fbaVar = (fba) proxyListActivity.G.get(i - i2);
            if (arrayList.contains(fbaVar)) {
                arrayList.remove(fbaVar);
            } else {
                arrayList.add(fbaVar);
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
                return ((k62) obj).R0;
            case 2:
                return ((DataAutoDownloadActivity) obj).y;
            case 3:
                return ((DataSettingsActivity) obj).U;
            case 4:
                return ((he4) obj).h.size();
            case 5:
                int size = ((cf4) obj).u1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 6:
                return ((hj4) obj).F.size();
            case 7:
                return ((pf6) obj).w;
            case 8:
                return ((NotificationsSettingsActivity) obj).V;
            case 9:
                return ((PasscodeActivity) obj).Q;
            case 10:
                g48 g48Var = (g48) obj;
                ArrayList arrayList = g48Var.d;
                if (arrayList == null) {
                    return 0;
                }
                return (int) Math.ceil(arrayList.size() / g48Var.f);
            case 11:
                return ((l58) obj).G;
            case 12:
                u58 u58Var = (u58) obj;
                ArrayList arrayList2 = u58Var.n;
                ArrayList arrayList3 = u58Var.f;
                xl6 xl6Var = u58Var.K;
                if (xl6Var == null) {
                    if (arrayList3.isEmpty()) {
                        if (!TextUtils.isEmpty(u58Var.w) || arrayList2.isEmpty()) {
                            return 0;
                        }
                        return arrayList2.size() + 2;
                    }
                    return arrayList3.size() + (!u58Var.s ? 1 : 0);
                }
                return xl6Var.e.size();
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                o98 o98Var = photoViewer.d;
                if (o98Var == null || o98Var.d() == null) {
                    return 0;
                }
                return photoViewer.d.d().size();
            case 14:
                return ((ProxyListActivity) obj).e;
            case 15:
                return eb6.g() + 1;
            case 16:
                ArrayList arrayList4 = ((dbb) this.d).x;
                if (arrayList4 == null) {
                    return 0;
                }
                return arrayList4.size();
            case 17:
                return ((ArrayList) obj).size();
            default:
                return ((vec) obj).h.size();
        }
    }

    @Override
    public final long c(int i) {
        int i2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 4:
                i2 = ((he4) obj).l0.get(i);
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
                if (i == ProxyListActivity.c0(proxyListActivity)) {
                    return -3L;
                }
                if (i == ProxyListActivity.d0(proxyListActivity)) {
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
                    return ((fba) proxyListActivity.G.get(i - i3)).hashCode();
                }
                return -7L;
            case 16:
                ArrayList arrayList = ((dbb) this.d).x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((dq6) arrayList.get(i)).a.hashCode();
            case 18:
                i2 = ((sec) ((vec) obj).h.get(i)).a;
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
                k62 k62Var = (k62) obj;
                if (i != k62Var.C0 && i != k62Var.G0 && i != k62Var.H0 && i != k62Var.D0 && i != k62Var.E0 && i != k62Var.F0 && i != k62Var.I0 && i != k62Var.N0.b && i != k62Var.O0.b) {
                    if (i == k62Var.m0 || i == k62Var.t0 || i == k62Var.x0 || i == k62Var.p0) {
                        return 0;
                    }
                    if (i == k62Var.s0) {
                        return 1;
                    }
                    if (i == k62Var.w0 || i == k62Var.y0 || i == k62Var.r0 || i == k62Var.L0) {
                        return 2;
                    }
                    if (i == k62Var.v0 || i == k62Var.J0 || i == k62Var.M0) {
                        return 3;
                    }
                    if (i == k62Var.n0) {
                        return 4;
                    }
                    if (i == k62Var.o0) {
                        return 11;
                    }
                    if (i == k62Var.q0) {
                        return 7;
                    }
                    if (i == k62Var.z0 || i == k62Var.A0 || i == k62Var.K0) {
                        return 6;
                    }
                    if (i == k62Var.B0) {
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
                if (i == DataAutoDownloadActivity.d0(dataAutoDownloadActivity)) {
                    return 3;
                }
                if (i != DataAutoDownloadActivity.j0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.k0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.c0(dataAutoDownloadActivity) && i != DataAutoDownloadActivity.l0(dataAutoDownloadActivity)) {
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
                if (i == dataSettingsActivity.e || i == dataSettingsActivity.h || i == dataSettingsActivity.f || i == DataSettingsActivity.e0(dataSettingsActivity) || i == DataSettingsActivity.c0(dataSettingsActivity) || i == DataSettingsActivity.g0(dataSettingsActivity)) {
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
                return ug8.F(((zi4) ((hj4) obj).F.get(i)).b);
            case 7:
                pf6 pf6Var = (pf6) obj;
                if (i == 0) {
                    return 0;
                }
                if (i == pf6Var.c || i == pf6Var.d || i == pf6Var.e || i == pf6Var.f || i == pf6Var.h) {
                    return 1;
                }
                if (i == pf6Var.n) {
                    return 2;
                }
                if (i != pf6Var.r) {
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
                if (i != PasscodeActivity.Z(passcodeActivity) && i != passcodeActivity.O && i != passcodeActivity.L && i != passcodeActivity.K) {
                    if (i == PasscodeActivity.b0(passcodeActivity) || i == PasscodeActivity.a0(passcodeActivity) || i == PasscodeActivity.c0(passcodeActivity)) {
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
                l58 l58Var = (l58) obj;
                if (i == l58Var.E || i == l58Var.F) {
                    return 1;
                }
                return 0;
            case 12:
                u58 u58Var = (u58) obj;
                ArrayList arrayList = u58Var.f;
                if (u58Var.Z) {
                    return 2;
                }
                if (u58Var.K == null) {
                    if (arrayList.isEmpty()) {
                        if (i == u58Var.n.size()) {
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
                if (i == ProxyListActivity.c0(proxyListActivity) || i == proxyListActivity.E) {
                    return 1;
                }
                if (i == ProxyListActivity.d0(proxyListActivity) || i == proxyListActivity.w) {
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
    public final void t(defpackage.s49 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s20.t(s49, int):void");
    }

    @Override
    public final void u(s49 s49Var, int i, List list) {
        boolean contains;
        switch (this.c) {
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i2 = s49Var.f;
                View view = s49Var.a;
                if (i2 == 5 && !list.isEmpty()) {
                    yt8 yt8Var = (yt8) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i - proxyListActivity.n))) != yt8Var.h) {
                        yt8Var.h = contains;
                        yt8Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        yt8Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (s49Var.f == 3 && list.contains(0)) {
                    ahb ahbVar = (ahb) view;
                    if (i == ProxyListActivity.d0(proxyListActivity)) {
                        ahbVar.setChecked(proxyListActivity.d);
                        return;
                    } else if (i == proxyListActivity.w) {
                        ahbVar.setChecked(gba.X0);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(s49Var, i);
                    return;
                }
            default:
                super.u(s49Var, i, list);
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        uib uibVar;
        i62 ld5Var;
        fja fjaVar;
        View b9aVar;
        FrameLayout frameLayout;
        hhb hhbVar;
        View ld5Var2;
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        wjb wjbVar5;
        View ahbVar;
        w48 w48Var;
        int i2;
        wgb wgbVar;
        View b9aVar2;
        FrameLayout frameLayout2;
        View q86Var;
        byte b = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Context context = (Context) obj2;
                if (i == 0) {
                    uibVar = new ld5(context);
                } else if (i == 1) {
                    uibVar = new ahb(context);
                } else if (i == 2) {
                    uib uibVar2 = new uib(context);
                    uibVar2.setCanDisable(true);
                    uibVar = uibVar2;
                } else {
                    uibVar = new mhb(context);
                }
                uibVar.setLayoutParams(new e49(-1, -2));
                return new s49(uibVar);
            case 1:
                Context context2 = (Context) obj2;
                k62 k62Var = (k62) obj;
                boolean z = k62Var.n;
                wjb wjbVar6 = k62Var.a;
                switch (i) {
                    case 0:
                        ld5Var = new ld5((Context) obj2, bkb.K6, 21, 15, false, k62Var.a);
                        break;
                    case 1:
                        View b9aVar3 = new b9a(context2, (de9) null);
                        new fm2(new ColorDrawable(bkb.v0(bkb.Z6, wjbVar6)), bkb.W0(context2, 2131231232, bkb.a7)).x = true;
                        ld5Var = b9aVar3;
                        break;
                    case 2:
                        ld5Var = new mhb(context2, wjbVar6);
                        break;
                    case 3:
                        ld5Var = new wgb(context2, wjbVar6);
                        break;
                    case 4:
                    case 11:
                        f62 f62Var = new f62(this, (Context) obj2, k62Var.J ? 1 : 0, k62Var.a, i);
                        if (i == 11 && !z) {
                            f62Var.setTextRight(98);
                            f62Var.b().setOnClickListener(new View.OnClickListener(this) {
                                public final s20 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    s20 s20Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            ((k62) s20Var.e).e0(-2);
                                            return;
                                        case 1:
                                            ((k62) s20Var.e).e0(-3);
                                            return;
                                        default:
                                            ((k62) s20Var.e).X(view, (le8) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        f62Var.e();
                        f62Var.setIconsColor(bkb.n7);
                        f62Var.c(new g62(this, f62Var, i));
                        ld5Var = f62Var;
                        break;
                    case 5:
                    default:
                        i62 i62Var = new i62(this, (Context) obj2, k62Var.J ? 1 : 0, new View.OnClickListener(this) {
                            public final s20 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                byte b2 = r2;
                                s20 s20Var = this.b;
                                switch (b2) {
                                    case 0:
                                        ((k62) s20Var.e).e0(-2);
                                        return;
                                    case 1:
                                        ((k62) s20Var.e).e0(-3);
                                        return;
                                    default:
                                        ((k62) s20Var.e).X(view, (le8) view.getParent(), true);
                                        return;
                                }
                            }
                        }, k62Var.a);
                        if (!z) {
                            i62Var.setTextRight(140);
                            i62Var.b().setOnClickListener(new kb1(this, i62Var, (byte) 10));
                        }
                        int i3 = bkb.n7;
                        i62Var.setIconsColor(i3);
                        wf2 wf2Var = i62Var.r;
                        if (wf2Var != null) {
                            wf2Var.getCheckBoxBase().i(gl.L(6.0f));
                            CheckBoxBase checkBoxBase = wf2Var.getCheckBoxBase();
                            float f = i62Var.a.e;
                            if (checkBoxBase.w != f) {
                                checkBoxBase.w = f;
                                checkBoxBase.b();
                            }
                        }
                        i62Var.getCheckBox().b(-1, i3, bkb.j7);
                        i62Var.c(new qy(this, i62Var, (byte) 2));
                        i62Var.setShowNextButton(true);
                        EditTextBoldCursor textView = i62Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new df(this, i62Var, (byte) 2));
                        textView.setOnKeyListener(new w6(i62Var, (byte) 2));
                        ld5Var = i62Var;
                        break;
                    case 6:
                        ld5Var = new ahb(context2, wjbVar6);
                        break;
                    case 7:
                        h62 h62Var = new h62(this, context2, k62Var.J ? 1 : 0);
                        h62Var.e();
                        if (!z) {
                            h62Var.setTextRight(98);
                            h62Var.b().setOnClickListener(new View.OnClickListener(this) {
                                public final s20 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    s20 s20Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            ((k62) s20Var.e).e0(-2);
                                            return;
                                        case 1:
                                            ((k62) s20Var.e).e0(-3);
                                            return;
                                        default:
                                            ((k62) s20Var.e).X(view, (le8) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        h62Var.setIconsColor(bkb.n7);
                        h62Var.c(new qy(this, h62Var, (byte) 1));
                        ld5Var = h62Var;
                        break;
                    case 8:
                        View d62Var = new d62(context2, (byte) 0);
                        d62Var.setTag(-33024);
                        ld5Var = d62Var;
                        break;
                    case 9:
                        View sbVar = new sb((byte) 5, context2, this);
                        sbVar.setTag(-33024);
                        ld5Var = sbVar;
                        break;
                    case 10:
                        je8 je8Var = new je8(context2, wjbVar6);
                        je8Var.getCheckBox().setIcon(2131232518);
                        ld5Var = je8Var;
                        break;
                }
                return ls6.h(ld5Var, ld5Var, -1, -2);
            case 2:
                Context context3 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    fjaVar = new mhb(context3);
                                } else {
                                    fjaVar = new vl7(context3);
                                }
                            } else {
                                fja fjaVar2 = new fja(context3, null);
                                fjaVar2.setCallback(new vu2(this, (byte) 12));
                                fjaVar = fjaVar2;
                            }
                        } else {
                            fjaVar = new ld5(context3);
                        }
                    } else {
                        fjaVar = new b9a(context3, (de9) null);
                    }
                } else {
                    ahb ahbVar2 = new ahb(context3);
                    ahbVar2.d(bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
                    ahbVar2.setTypeface(gl.o());
                    ahbVar2.setHeight(56);
                    fjaVar = ahbVar2;
                }
                return ls6.h(fjaVar, fjaVar, -1, -2);
            case 3:
                Context context4 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        b9aVar = new wgb(context4);
                                    } else {
                                        b9aVar = new vl7(context4);
                                    }
                                } else {
                                    b9aVar = new mhb(context4);
                                }
                            } else {
                                b9aVar = new ahb(context4);
                            }
                        } else {
                            b9aVar = new ld5(context4, 22);
                        }
                    } else {
                        b9aVar = new uib(context4);
                    }
                } else {
                    b9aVar = new b9a(context4, (de9) null);
                }
                return ls6.h(b9aVar, b9aVar, -1, -2);
            case 4:
                return new s49(new fe4((he4) obj, (Context) obj2));
            case 5:
                zw0 zw0Var = new zw0(0, null, (Activity) obj2);
                zw0Var.setBackground(null);
                zw0Var.setLayoutParams(new e49(-1, -2));
                return new s49(zw0Var);
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                int F = ug8.F(ug8.G(3)[i]);
                if (F != 1) {
                    if (F != 2) {
                        frameLayout = new ad(launchActivity, null);
                    } else {
                        ?? frameLayout3 = new FrameLayout(launchActivity);
                        frameLayout3.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout3.h = textPaint;
                        textPaint.setTextSize(gl.L(16.0f));
                        av9 av9Var = new av9(launchActivity);
                        frameLayout3.a = av9Var;
                        av9Var.setReportChanges(true);
                        av9Var.setDelegate(new s34((Object) frameLayout3, (byte) 2));
                        av9Var.setImportantForAccessibility(2);
                        frameLayout3.addView(av9Var, nme.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout = new ld5(launchActivity);
                }
                frameLayout.setLayoutParams(new e49(-1, -2));
                return new s49(frameLayout);
            case 7:
                Context context5 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                hhbVar = new mhb(context5);
                            } else {
                                View uibVar3 = new uib(context5);
                                zkb.h(bkb.c6, null, uibVar3);
                                hhbVar = uibVar3;
                            }
                        } else {
                            hhbVar = new b9a(context5, (de9) null);
                        }
                    } else {
                        hhb hhbVar2 = new hhb(context5);
                        hhbVar2.setMultilineDetail(true);
                        zkb.h(bkb.c6, null, hhbVar2);
                        hhbVar = hhbVar2;
                    }
                } else {
                    View ld5Var3 = new ld5(context5);
                    zkb.h(bkb.c6, null, ld5Var3);
                    hhbVar = ld5Var3;
                }
                return ls6.h(hhbVar, hhbVar, -1, -2);
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context6 = (Context) obj2;
                if (i == 0) {
                    wjbVar = ((d) notificationsSettingsActivity).resourceProvider;
                    ld5Var2 = new ld5(context6, wjbVar);
                } else if (i == 1) {
                    wjbVar2 = ((d) notificationsSettingsActivity).resourceProvider;
                    ld5Var2 = new ahb(context6, wjbVar2);
                } else if (i != 2) {
                    if (i == 3) {
                        wjbVar3 = ((d) notificationsSettingsActivity).resourceProvider;
                        ld5Var2 = new vl7((Context) obj2, 21, 64, true, wjbVar3);
                    } else if (i != 4) {
                        if (i != 5) {
                            wjbVar5 = ((d) notificationsSettingsActivity).resourceProvider;
                            ld5Var2 = new mhb(context6, wjbVar5);
                        } else {
                            wjbVar4 = ((d) notificationsSettingsActivity).resourceProvider;
                            ld5Var2 = new uib(0, wjbVar4, context6);
                        }
                    } else {
                        ld5Var2 = new b9a(context6, (de9) null);
                    }
                } else {
                    ld5Var2 = new hhb(context6);
                }
                return new s49(ld5Var2);
            case 9:
                Context context7 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                ahbVar = new mhb(context7);
                            } else {
                                ahbVar = new lv7(context7);
                                ahbVar.setTag(-33024);
                            }
                        } else {
                            ahbVar = new ld5(context7);
                        }
                    } else {
                        ahbVar = new uib(context7);
                    }
                } else {
                    ahbVar = new ahb(context7);
                }
                return new s49(ahbVar);
            case 10:
                Context context8 = (Context) obj2;
                ?? frameLayout4 = new FrameLayout(context8);
                frameLayout4.e = new Paint();
                frameLayout4.b = new xl6[4];
                frameLayout4.a = new v58[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    frameLayout4.a[i4] = new v58((x58) frameLayout4, context8);
                    frameLayout4.addView(frameLayout4.a[i4]);
                    frameLayout4.a[i4].setVisibility(4);
                    frameLayout4.a[i4].setTag(Integer.valueOf(i4));
                    frameLayout4.a[i4].setOnClickListener(new fr7(frameLayout4, (byte) 13));
                }
                frameLayout4.setDelegate(new im6(this, (byte) 27));
                return new s49(frameLayout4);
            case 11:
                Context context9 = (Context) obj2;
                if (i == 0) {
                    wjb wjbVar7 = ((l58) obj).J0;
                    ?? frameLayout5 = new FrameLayout(context9);
                    frameLayout5.e = new bg7(frameLayout5, (byte) 7);
                    TextView textView2 = new TextView(context9);
                    frameLayout5.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout5.addView(textView2, nme.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context9);
                    frameLayout5.b = textView3;
                    zkb.X(textView3, bkb.pg, wjbVar7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout5.addView(textView3, nme.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view = new View(context9);
                    Paint paint = new Paint();
                    view.a = paint;
                    Paint paint2 = new Paint(1);
                    view.b = paint2;
                    view.c = gl.L(16.0f);
                    view.d = 0;
                    view.e = 0.0f;
                    view.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout5.c = view;
                    frameLayout5.addView(view, nme.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout5.setSeekBarDelegate(new im6(this, (byte) 28));
                    w48Var = frameLayout5;
                } else {
                    w48 w48Var2 = new w48(context9);
                    w48Var2.setOnClickListener(new fr7(this, (byte) 11));
                    w48Var = w48Var2;
                }
                return new s49(w48Var);
            case 12:
                u58 u58Var = (u58) obj;
                boolean z2 = u58Var.s0;
                Context context10 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                qo3 qo3Var = new qo3(context10, null);
                                qo3Var.setForceDarkTheme(z2);
                                wgbVar = qo3Var;
                            } else {
                                wgb wgbVar2 = new wgb(23, context10, true);
                                wgbVar2.setLayoutParams(new e49(-1, -2));
                                wgbVar = wgbVar2;
                                if (z2) {
                                    zkb.W(wgbVar2.a, u58Var.w0, null);
                                    zkb.s(wgbVar2.e, bkb.hh, null, PorterDuff.Mode.MULTIPLY);
                                    wgbVar = wgbVar2;
                                }
                            }
                        } else {
                            wgbVar = new iba(1, null, context10);
                        }
                    } else {
                        ViewGroup frameLayout6 = new FrameLayout(context10);
                        frameLayout6.setLayoutParams(new e49(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context10, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout6.addView(radialProgressView, nme.c(-1.0f, -1));
                        wgbVar = frameLayout6;
                    }
                } else {
                    o48 o48Var = new o48(context10, null);
                    o48Var.setDelegate(new r58(this));
                    FrameLayout checkFrame = o48Var.getCheckFrame();
                    if (u58Var.U != 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    checkFrame.setVisibility(i2);
                    wgbVar = o48Var;
                }
                return new s49(wgbVar);
            case 13:
                Context context11 = (Context) obj2;
                ?? frameLayout7 = new FrameLayout(context11);
                frameLayout7.setWillNotDraw(false);
                be0 be0Var = new be0(context11);
                frameLayout7.a = be0Var;
                be0Var.setRoundRadius(gl.L(4.0f));
                frameLayout7.addView(be0Var, nme.c(-1.0f, -1));
                FrameLayout frameLayout8 = new FrameLayout(context11);
                frameLayout7.b = frameLayout8;
                frameLayout7.addView(frameLayout8, nme.e(42, 42, 53));
                jo0 jo0Var = new jo0(context11);
                jo0Var.c = new Path();
                jo0Var.b = new float[8];
                jo0Var.d = new RectF();
                jo0Var.e = new Paint(1);
                frameLayout7.e = jo0Var;
                jo0Var.setWillNotDraw(false);
                jo0Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
                frameLayout7.addView(jo0Var, nme.e(-1, 16, 83));
                jo0Var.addView(tb4.k(context11, 2131231466), nme.e(-2, -2, 19));
                TextView textView4 = new TextView(context11);
                frameLayout7.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                jo0Var.addView(textView4, nme.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                wf2 wf2Var2 = new wf2(24, null, context11);
                frameLayout7.c = wf2Var2;
                wf2Var2.setDrawBackgroundAsArc(11);
                wf2Var2.b(bkb.V9, bkb.W9, bkb.U9);
                frameLayout7.addView(wf2Var2, nme.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                wf2Var2.setVisibility(0);
                frameLayout7.setFocusable(true);
                frameLayout8.setOnClickListener(new fr7(this, (byte) 15));
                return new s49(frameLayout7);
            case 14:
                Context context12 = (Context) obj2;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 6) {
                                        b9aVar2 = new yt8((ProxyListActivity) obj, context12);
                                        zkb.h(bkb.c6, null, b9aVar2);
                                    } else {
                                        b9aVar2 = new fja(context12, null);
                                        zkb.h(bkb.c6, null, b9aVar2);
                                    }
                                } else {
                                    b9aVar2 = new mhb(context12);
                                }
                            } else {
                                b9aVar2 = new ahb(context12);
                                zkb.h(bkb.c6, null, b9aVar2);
                            }
                        } else {
                            b9aVar2 = new ld5(context12);
                            zkb.h(bkb.c6, null, b9aVar2);
                        }
                    } else {
                        b9aVar2 = new uib(context12);
                        zkb.h(bkb.c6, null, b9aVar2);
                    }
                } else {
                    b9aVar2 = new b9a(context12, (de9) null);
                }
                return ls6.h(b9aVar2, b9aVar2, -1, -2);
            case 15:
                Context context13 = (Context) obj2;
                kga kgaVar = (kga) obj;
                if (i != 0) {
                    FrameLayout ar8Var = new ar8(context13, (byte) 7);
                    ar8Var.setWillNotDraw(false);
                    TextView textView5 = new TextView(context13);
                    kgaVar.o1 = textView5;
                    zkb.X(textView5, bkb.I5, kgaVar.J0);
                    kgaVar.o1.setTextSize(1, 14.0f);
                    kgaVar.o1.setGravity(17);
                    kgaVar.o1.setPadding(0, 0, 0, gl.L(8.0f));
                    ar8Var.addView(kgaVar.o1, nme.c(40.0f, -1));
                    frameLayout2 = ar8Var;
                } else {
                    frameLayout2 = new hga(54, kgaVar.J0, context13, false);
                }
                return new s49(frameLayout2);
            case 16:
                return new s49(new cbb((dbb) obj, ((dbb) obj2).getContext()));
            case 17:
                Context context14 = (Context) obj2;
                if (i == 0) {
                    q86Var = new ue3(context14, false);
                } else {
                    q86Var = new q86(context14);
                }
                q86Var.setLayoutParams(new e49(-1, -2));
                return new s49(q86Var);
            default:
                return new s49(new tec((vec) obj, (Context) obj2));
        }
    }

    @Override
    public final void y(s49 s49Var) {
        int i;
        int i2;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 1:
                k62 k62Var = (k62) obj;
                ud8 ud8Var = k62Var.n1;
                boolean z = k62Var.n;
                int i3 = s49Var.f;
                View view = s49Var.a;
                CharSequence charSequence = "";
                if (i3 == 4) {
                    le8 le8Var = (le8) view;
                    le8Var.setTag(1);
                    CharSequence charSequence2 = k62Var.O;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z) {
                        i2 = 2131743812;
                    } else {
                        i2 = 2131746255;
                    }
                    le8Var.o(charSequence, k96.M0(i2, null), true);
                    le8Var.setTag(null);
                    k62Var.i0(s49Var.b(), view);
                    return;
                } else if (i3 == 11) {
                    le8 le8Var2 = (le8) view;
                    le8Var2.setTag(1);
                    CharSequence charSequence3 = k62Var.P;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    le8Var2.o(charSequence, k96.M0(2131746256, null), false);
                    le8Var2.setTag(null);
                    le8Var2.e.a(ud8Var.b(-2), false);
                    k62Var.i0(s49Var.b(), view);
                    return;
                } else if (i3 == 5) {
                    int b2 = s49Var.b();
                    le8 le8Var3 = (le8) view;
                    le8Var3.setTag(1);
                    le8Var3.a.a(k62Var.c0, false);
                    int i4 = b2 - k62Var.u0;
                    CharSequence charSequence4 = k62Var.L[i4];
                    if (z) {
                        i = 2131743814;
                    } else {
                        i = 2131747581;
                    }
                    le8Var3.o(charSequence4, k96.M0(i, null), true);
                    le8Var3.setTag(null);
                    if (k62Var.l0 == b2) {
                        EditTextBoldCursor textView = le8Var3.getTextView();
                        textView.requestFocus();
                        gl.F3(textView);
                        k62Var.l0 = -1;
                    }
                    if (!z) {
                        le8Var3.e.a(ud8Var.b(i4), false);
                    }
                    k62Var.i0(b2, view);
                    return;
                } else if (i3 == 7) {
                    le8 le8Var4 = (le8) view;
                    le8Var4.setTag(1);
                    CharSequence charSequence5 = k62Var.Q;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    le8Var4.o(charSequence, k96.M0(2131754471, null), false);
                    le8Var4.setTag(null);
                    if (!z) {
                        le8Var4.e.a(ud8Var.b(-3), false);
                    }
                    k62Var.i0(s49Var.b(), view);
                    return;
                } else {
                    return;
                }
            case 3:
                if (s49Var.f == 3) {
                    ahb ahbVar = (ahb) s49Var.a;
                    int b3 = s49Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b3 == dataSettingsActivity.F) {
                        ahbVar.setChecked(gba.A0);
                        return;
                    } else if (b3 == dataSettingsActivity.E) {
                        ahbVar.setChecked(gba.x0);
                        return;
                    } else if (b3 == dataSettingsActivity.G) {
                        ahbVar.setChecked(gba.y0);
                        return;
                    } else if (b3 == dataSettingsActivity.H) {
                        ahbVar.setChecked(gba.z0);
                        return;
                    } else if (b3 == dataSettingsActivity.K) {
                        boolean z2 = gba.a;
                        ahbVar.setChecked(e66.e(2048));
                        return;
                    } else if (b3 == dataSettingsActivity.L) {
                        boolean z3 = gba.a;
                        ahbVar.setChecked(e66.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (s49Var.f == 3) {
                    ahb ahbVar2 = (ahb) s49Var.a;
                    int b4 = s49Var.b();
                    if (b4 == ProxyListActivity.d0(proxyListActivity)) {
                        ahbVar2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b4 == proxyListActivity.w) {
                        ahbVar2.setChecked(gba.X0);
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
    public final void z(s49 s49Var) {
        switch (this.c) {
            case 1:
                k62 k62Var = (k62) this.e;
                int i = s49Var.f;
                if (i == 4 || i == 11 || i == 5) {
                    EditTextBoldCursor textView = ((le8) s49Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (k62Var.J) {
                            c62 c62Var = k62Var.y;
                            if (c62Var != null) {
                                c62Var.e();
                            }
                            k62Var.Z(true);
                        }
                        k62Var.h1 = null;
                        textView.clearFocus();
                        gl.t1(textView);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public s20(hj4 hj4Var, LaunchActivity launchActivity) {
        this.c = (byte) 6;
        this.e = hj4Var;
        this.d = launchActivity;
    }

    public s20(Object obj, Object obj2, byte b) {
        this.c = b;
        this.e = obj;
        this.d = obj2;
    }

    public s20(ProxyListActivity proxyListActivity, Context context) {
        this.c = (byte) 14;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
