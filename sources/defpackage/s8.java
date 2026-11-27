package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class s8 extends d6 {
    public final byte a;
    public final Object b;

    public s8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        String str;
        r47 r47Var;
        d31 b0;
        jla jlaVar;
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((v8) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i == -1) {
                    ((ds) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i == -1) {
                    ((is) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                j20 j20Var = (j20) obj;
                if (i == -1) {
                    j20Var.dismiss();
                    return;
                } else {
                    j20Var.K0(i);
                    return;
                }
            case 4:
                if (i == -1) {
                    ((kp9) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i == -1) {
                    ((x60) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                dd0 dd0Var = (dd0) obj;
                if (i == -1) {
                    if (dd0Var.onBackPressed(true)) {
                        dd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    dd0Var.b0();
                    return;
                } else {
                    return;
                }
            case 7:
                dm0 dm0Var = (dm0) obj;
                HashSet hashSet = dm0Var.y;
                if (i == -1) {
                    if (dm0.c0(dm0Var).z()) {
                        dm0.d0(dm0Var).y();
                        hashSet.clear();
                        hl.d0(dm0Var.a, new bm0((byte) 0));
                        return;
                    }
                    dm0Var.finishFragment();
                    return;
                } else if (i == 2131296496) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        ArrayList arrayList2 = dm0Var.e.a;
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                Object obj2 = arrayList2.get(i4);
                                i4++;
                                r47Var = (r47) obj2;
                                if (r47Var == null || r47Var.e1() != intValue) {
                                }
                            } else {
                                r47Var = null;
                            }
                        }
                        db dbVar = dm0Var.f;
                        if (dbVar != null && r47Var == null) {
                            ArrayList arrayList3 = dbVar.a;
                            int size2 = arrayList3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 < size2) {
                                    Object obj3 = arrayList3.get(i5);
                                    i5++;
                                    r47 r47Var2 = (r47) obj3;
                                    if (r47Var2 != null && r47Var2.e1() == intValue) {
                                        r47Var = r47Var2;
                                    }
                                }
                            }
                        }
                        if (r47Var != null) {
                            arrayList.add(r47Var);
                            hashSet3.add(Integer.valueOf(r47Var.e1()));
                            hashSet2.add(fb.a(r47Var));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dm0Var.getResourceProvider(), dm0Var.getParentActivity());
                    String G = ob6.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = G;
                    if (hashSet3.size() == 1) {
                        str = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str = "AreYouSureUnsaveFewMessages";
                    }
                    idVar.U = ob6.N0(str);
                    alertDialog$Builder.j(ob6.M0(2131751563, null), new o(dm0Var, hashSet3, (byte) 18));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder.c(-1);
                    alertDialog$Builder.o();
                    return;
                } else if (i == 2131296500) {
                    dm0Var.g0();
                    return;
                } else {
                    return;
                }
            case 8:
                if (i == -1) {
                    ((vo0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                ((rr0) obj).f0(i);
                return;
            case 10:
                if (i == -1) {
                    ((at0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i == -1) {
                    ((ny0) obj).dismiss();
                    return;
                }
                return;
            case 12:
                g41 g41Var = (g41) obj;
                if (i == -1) {
                    if (g41Var.onBackPressed(true)) {
                        g41Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    g41Var.j0();
                    return;
                } else {
                    return;
                }
            case 13:
                if (i == -1) {
                    ((d61) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                z61 z61Var = (z61) obj;
                if (i == -1) {
                    if (z61.Y(z61Var).z()) {
                        d71 d71Var = z61Var.e0;
                        if (d71Var != null) {
                            d71Var.d();
                        }
                        l61 l61Var = z61Var.N;
                        if (l61Var != null) {
                            l61Var.f(false);
                            z61Var.N.e();
                            return;
                        }
                        return;
                    }
                    z61Var.finishFragment();
                    return;
                } else if (i == 1) {
                    z61Var.h0();
                    return;
                } else if (i == 3) {
                    z61Var.g0(false);
                    return;
                } else if (i == 4) {
                    z61Var.g0(true);
                    return;
                } else {
                    return;
                }
            case 15:
                j81 j81Var = (j81) obj;
                if (i == -1) {
                    if (j81Var.Q == 0 && j81Var.R == 0 && !j81Var.H) {
                        j81Var.finishFragment();
                        return;
                    }
                    j81Var.H = false;
                    j81Var.Q = 0;
                    j81Var.R = 0;
                    j81Var.B0();
                    j81Var.r0();
                    return;
                }
                return;
            case 16:
                i91 i91Var = (i91) obj;
                if (i == -1) {
                    jlaVar = ((e) i91Var).simpleActionBar;
                    if (jlaVar.z()) {
                        i91Var.d0(true);
                        return;
                    } else {
                        i91Var.finishFragment();
                        return;
                    }
                } else if (i == 2) {
                    i91Var.m0(false);
                    return;
                } else if (i == 3) {
                    i91Var.m0(true);
                    return;
                } else if (i == 4) {
                    i91Var.k0(false);
                    if (i91Var.s) {
                        b0 = d31.Y();
                    } else {
                        b0 = d31.b0(i91Var);
                    }
                    v21 J = b0.J(2131623990, hl.S2(ob6.M0(2131749213, null)), ob6.M0(2131743540, null), 5000, true, new fv0(this, (byte) 14));
                    J.j = 5000;
                    J.j();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i == -1) {
                    ((la1) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                ie1 ie1Var = (ie1) obj;
                if (i == -1) {
                    ie1Var.finishFragment();
                    return;
                } else if (i == 1 && ie1Var.a.getText().length() != 0) {
                    ie1Var.Y();
                    ie1Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 19:
                ve1 ve1Var = (ve1) obj;
                if (i == -1) {
                    ve1Var.finishFragment();
                    return;
                } else if (i == 1) {
                    ve1Var.k0();
                    ve1Var.j0();
                    return;
                } else {
                    return;
                }
            case 20:
                if (i == -1) {
                    ((wf1) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                wh1 wh1Var = (wh1) obj;
                if (i == -1) {
                    if (wh1Var.b >= wh1Var.Z0() && wh1Var.U0()) {
                        wh1Var.c1();
                        return;
                    } else {
                        wh1Var.finishFragment();
                        return;
                    }
                } else if (i == 1) {
                    FrameLayout frameLayout = (FrameLayout) wh1Var.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    wh1Var.M.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    wh1Var.M.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    wh1Var.M.getLocationInWindow(iArr);
                    float f = iArr[0];
                    float f2 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    gh1 gh1Var = new gh1(wh1Var, wh1Var.getParentActivity(), canvas, (wh1Var.M.getMeasuredWidth() / 2.0f) + f, (wh1Var.M.getMeasuredHeight() / 2.0f) + f2, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + hl.n, paint, createBitmap, paint2, f, f2, (byte) 0);
                    wh1Var.n0 = gh1Var;
                    gh1Var.setOnTouchListener(new q8((byte) 25));
                    wh1Var.o0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    wh1Var.p0 = ofFloat;
                    ofFloat.addUpdateListener(new hh1(wh1Var, (byte) 0));
                    wh1Var.p0.addListener(new jb1(wh1Var, (byte) 4));
                    wh1Var.p0.setDuration(400L);
                    wh1Var.p0.setInterpolator(dt3.e);
                    wh1Var.p0.start();
                    frameLayout.addView(wh1Var.n0, new ViewGroup.LayoutParams(-1, -1));
                    hl.c3(new bh1(wh1Var, (byte) 1));
                    return;
                } else {
                    return;
                }
            case 22:
                gi1 gi1Var = (gi1) obj;
                long j = gi1Var.k0;
                xh1 xh1Var = gi1Var.x0;
                if (i == -1) {
                    if (gi1Var.t0) {
                        gi1Var.j0();
                        return;
                    } else {
                        gi1Var.finishFragment();
                        return;
                    }
                } else if (i == 1) {
                    int i6 = gi1Var.j0;
                    if (i6 == 0) {
                        if (gi1Var.getParentActivity() != null) {
                            if (gi1Var.t0) {
                                gi1Var.j0();
                                return;
                            } else if (gi1Var.d.a.length() == 0) {
                                Vibrator vibrator = (Vibrator) gi1Var.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                hl.z3(gi1Var.d);
                                return;
                            } else {
                                gi1Var.t0 = true;
                                hl.d3(xh1Var, 200L);
                                if (!gi1Var.x.g()) {
                                    i3 = ((e) gi1Var).currentAccount;
                                    gi1Var.u0 = Integer.valueOf(uc7.s1(i3).S(gi1Var.d.getText().toString(), new ArrayList(), gi1Var.y.getText().toString(), 2, false, null, null, -1, gi1Var));
                                    return;
                                }
                                gi1Var.s0 = true;
                                return;
                            }
                        }
                        return;
                    } else if (i6 == 1) {
                        if (!gi1Var.c0) {
                            if (gi1Var.y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gi1Var.getParentActivity());
                                String M0 = ob6.M0(2131752286, null);
                                id idVar2 = alertDialog$Builder2.a;
                                idVar2.S = M0;
                                idVar2.U = ob6.M0(2131752287, null);
                                alertDialog$Builder2.j(ob6.M0(2131752006, null), null);
                                gi1Var.showDialog(idVar2);
                                return;
                            } else if (!gi1Var.b0) {
                                Vibrator vibrator2 = (Vibrator) gi1Var.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                hl.z3(gi1Var.W);
                                return;
                            } else {
                                hl.d3(xh1Var, 200L);
                                i2 = ((e) gi1Var).currentAccount;
                                uc7 s1 = uc7.s1(i2);
                                long j2 = gi1Var.k0;
                                String str2 = gi1Var.Z;
                                Runnable runnable = new Runnable(this) {
                                    public final s8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        s8 s8Var = this.b;
                                        switch (b2) {
                                            case 0:
                                                gi1 gi1Var2 = (gi1) s8Var.b;
                                                gi1Var2.l0(false);
                                                icc iccVar = gi1Var2.v0;
                                                if (iccVar != null) {
                                                    iccVar.a(gi1Var2, Long.valueOf(gi1Var2.k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                gi1 gi1Var3 = (gi1) s8Var.b;
                                                gi1Var3.l0(false);
                                                icc iccVar2 = gi1Var3.v0;
                                                if (iccVar2 != null) {
                                                    iccVar2.a(gi1Var3, Long.valueOf(gi1Var3.k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable2 = new Runnable(this) {
                                    public final s8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        s8 s8Var = this.b;
                                        switch (b2) {
                                            case 0:
                                                gi1 gi1Var2 = (gi1) s8Var.b;
                                                gi1Var2.l0(false);
                                                icc iccVar = gi1Var2.v0;
                                                if (iccVar != null) {
                                                    iccVar.a(gi1Var2, Long.valueOf(gi1Var2.k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                gi1 gi1Var3 = (gi1) s8Var.b;
                                                gi1Var3.l0(false);
                                                icc iccVar2 = gi1Var3.v0;
                                                if (iccVar2 != null) {
                                                    iccVar2.a(gi1Var3, Long.valueOf(gi1Var3.k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = s1.h1(j2);
                                tL_channels_updateUsername.username = str2;
                                s1.getConnectionsManager().sendRequest(tL_channels_updateUsername, new v97(s1, j2, str2, runnable, gi1Var, tL_channels_updateUsername, runnable2), 64);
                            }
                        } else {
                            icc iccVar = gi1Var.v0;
                            if (iccVar != null) {
                                iccVar.a(gi1Var, Long.valueOf(j));
                            }
                        }
                        if (gi1Var.v0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j);
                            bundle.putInt("chatType", 2);
                            gi1Var.presentFragment(new rc5(bundle), true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 23:
                n12 n12Var = (n12) obj;
                f12 f12Var = n12Var.v2;
                if (i == -1) {
                    if (!f12Var.k()) {
                        n12Var.dismiss();
                        return;
                    }
                    return;
                }
                f12Var.x(i);
                return;
            case 24:
                t82 t82Var = (t82) obj;
                if (i == -1 && !t82Var.c0(true)) {
                    t82Var.finishFragment();
                    return;
                }
                return;
            case 25:
                g92 g92Var = (g92) obj;
                if (i == -1) {
                    if (g92Var.b0(true)) {
                        g92Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    g92Var.n0();
                    return;
                } else {
                    return;
                }
            case 26:
                if (i == -1) {
                    ((na2) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i == -1) {
                    ((ed2) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                pd2 pd2Var = (pd2) obj;
                if (i == -1) {
                    if (pd2Var.b0(true)) {
                        pd2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    pd2Var.n0(true);
                    return;
                } else {
                    return;
                }
            default:
                bg2 bg2Var = (bg2) obj;
                if (i == -1) {
                    if (bg2Var.g0(true)) {
                        bg2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    bg2Var.y0();
                    return;
                } else {
                    return;
                }
        }
    }
}
