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
import org.telegram.ui.ActionBar.d;
public final class r8 extends c6 {
    public final byte a;
    public final Object b;

    public r8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        String str;
        k27 k27Var;
        pha phaVar;
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((u8) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i == -1) {
                    ((cs) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i == -1) {
                    ((hs) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                i20 i20Var = (i20) obj;
                if (i == -1) {
                    i20Var.dismiss();
                    return;
                } else {
                    i20Var.J0(i);
                    return;
                }
            case 4:
                if (i == -1) {
                    ((vl9) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i == -1) {
                    ((v60) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                bd0 bd0Var = (bd0) obj;
                if (i == -1) {
                    if (bd0Var.onBackPressed(true)) {
                        bd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    bd0Var.b0();
                    return;
                } else {
                    return;
                }
            case 7:
                dm0 dm0Var = (dm0) obj;
                HashSet hashSet = dm0Var.y;
                if (i == -1) {
                    if (dm0.c0(dm0Var).y()) {
                        dm0.d0(dm0Var).x();
                        hashSet.clear();
                        gl.d0(dm0Var.a, new bm0((byte) 0));
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
                                k27Var = (k27) obj2;
                                if (k27Var == null || k27Var.e1() != intValue) {
                                }
                            } else {
                                k27Var = null;
                            }
                        }
                        cb cbVar = dm0Var.f;
                        if (cbVar != null && k27Var == null) {
                            ArrayList arrayList3 = cbVar.a;
                            int size2 = arrayList3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 < size2) {
                                    Object obj3 = arrayList3.get(i5);
                                    i5++;
                                    k27 k27Var2 = (k27) obj3;
                                    if (k27Var2 != null && k27Var2.e1() == intValue) {
                                        k27Var = k27Var2;
                                    }
                                }
                            }
                        }
                        if (k27Var != null) {
                            arrayList.add(k27Var);
                            hashSet3.add(Integer.valueOf(k27Var.e1()));
                            hashSet2.add(eb.a(k27Var));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dm0Var.getResourceProvider(), dm0Var.getParentActivity());
                    String G = k96.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = G;
                    if (hashSet3.size() == 1) {
                        str = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str = "AreYouSureUnsaveFewMessages";
                    }
                    hdVar.U = k96.N0(str);
                    alertDialog$Builder.j(k96.M0(2131751586, null), new o(dm0Var, hashSet3, (byte) 18));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
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
                if (i == -1) {
                    ((ss0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i == -1) {
                    ((fy0) obj).dismiss();
                    return;
                }
                return;
            case 11:
                y31 y31Var = (y31) obj;
                if (i == -1) {
                    if (y31Var.onBackPressed(true)) {
                        y31Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    y31Var.j0();
                    return;
                } else {
                    return;
                }
            case 12:
                if (i == -1) {
                    ((v51) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                r61 r61Var = (r61) obj;
                if (i == -1) {
                    if (r61.Y(r61Var).x()) {
                        v61 v61Var = r61Var.e0;
                        if (v61Var != null) {
                            v61Var.d();
                        }
                        d61 d61Var = r61Var.N;
                        if (d61Var != null) {
                            d61Var.f(false);
                            r61Var.N.e();
                            return;
                        }
                        return;
                    }
                    r61Var.finishFragment();
                    return;
                } else if (i == 1) {
                    r61Var.h0();
                    return;
                } else if (i == 3) {
                    r61Var.g0(false);
                    return;
                } else if (i == 4) {
                    r61Var.g0(true);
                    return;
                } else {
                    return;
                }
            case 14:
                b81 b81Var = (b81) obj;
                if (i == -1) {
                    if (b81Var.Q == 0 && b81Var.R == 0 && !b81Var.H) {
                        b81Var.finishFragment();
                        return;
                    }
                    b81Var.H = false;
                    b81Var.Q = 0;
                    b81Var.R = 0;
                    b81Var.A0();
                    b81Var.r0();
                    return;
                }
                return;
            case 15:
                z81 z81Var = (z81) obj;
                if (i == -1) {
                    phaVar = ((d) z81Var).simpleActionBar;
                    if (phaVar.x()) {
                        z81Var.d0(true);
                        return;
                    } else {
                        z81Var.finishFragment();
                        return;
                    }
                } else if (i == 2) {
                    z81Var.m0(false);
                    return;
                } else if (i == 3) {
                    z81Var.m0(true);
                    return;
                } else {
                    return;
                }
            case 16:
                if (i == -1) {
                    ((da1) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                zd1 zd1Var = (zd1) obj;
                if (i == -1) {
                    zd1Var.finishFragment();
                    return;
                } else if (i == 1 && zd1Var.a.getText().length() != 0) {
                    zd1Var.Y();
                    zd1Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                me1 me1Var = (me1) obj;
                if (i == -1) {
                    me1Var.finishFragment();
                    return;
                } else if (i == 1) {
                    me1Var.k0();
                    me1Var.j0();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i == -1) {
                    ((nf1) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                nh1 nh1Var = (nh1) obj;
                if (i == -1) {
                    if (nh1Var.b >= nh1Var.Y0() && nh1Var.T0()) {
                        nh1Var.b1();
                        return;
                    } else {
                        nh1Var.finishFragment();
                        return;
                    }
                } else if (i == 1) {
                    FrameLayout frameLayout = (FrameLayout) nh1Var.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    nh1Var.M.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    nh1Var.M.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    nh1Var.M.getLocationInWindow(iArr);
                    float f = iArr[0];
                    float f2 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    xg1 xg1Var = new xg1(nh1Var, nh1Var.getParentActivity(), canvas, (nh1Var.M.getMeasuredWidth() / 2.0f) + f, (nh1Var.M.getMeasuredHeight() / 2.0f) + f2, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n, paint, createBitmap, paint2, f, f2, (byte) 0);
                    nh1Var.n0 = xg1Var;
                    xg1Var.setOnTouchListener(new p8((byte) 25));
                    nh1Var.o0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nh1Var.p0 = ofFloat;
                    ofFloat.addUpdateListener(new yg1(nh1Var, (byte) 0));
                    nh1Var.p0.addListener(new bb1(nh1Var, (byte) 4));
                    nh1Var.p0.setDuration(400L);
                    nh1Var.p0.setInterpolator(ls3.e);
                    nh1Var.p0.start();
                    frameLayout.addView(nh1Var.n0, new ViewGroup.LayoutParams(-1, -1));
                    gl.c3(new sg1(nh1Var, (byte) 0));
                    return;
                } else {
                    return;
                }
            case 21:
                yh1 yh1Var = (yh1) obj;
                long j = yh1Var.k0;
                oh1 oh1Var = yh1Var.x0;
                if (i == -1) {
                    if (yh1Var.t0) {
                        yh1Var.j0();
                        return;
                    } else {
                        yh1Var.finishFragment();
                        return;
                    }
                } else if (i == 1) {
                    int i6 = yh1Var.j0;
                    if (i6 == 0) {
                        if (yh1Var.getParentActivity() != null) {
                            if (yh1Var.t0) {
                                yh1Var.j0();
                                return;
                            } else if (yh1Var.d.a.length() == 0) {
                                Vibrator vibrator = (Vibrator) yh1Var.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                gl.z3(yh1Var.d);
                                return;
                            } else {
                                yh1Var.t0 = true;
                                gl.d3(oh1Var, 200L);
                                if (!yh1Var.x.g()) {
                                    i3 = ((d) yh1Var).currentAccount;
                                    yh1Var.u0 = Integer.valueOf(na7.q1(i3).Q(yh1Var.d.getText().toString(), new ArrayList(), yh1Var.y.getText().toString(), 2, false, null, null, -1, yh1Var));
                                    return;
                                }
                                yh1Var.s0 = true;
                                return;
                            }
                        }
                        return;
                    } else if (i6 == 1) {
                        if (!yh1Var.c0) {
                            if (yh1Var.y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yh1Var.getParentActivity());
                                String M0 = k96.M0(2131752304, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.S = M0;
                                hdVar2.U = k96.M0(2131752305, null);
                                alertDialog$Builder2.j(k96.M0(2131752029, null), null);
                                yh1Var.showDialog(hdVar2);
                                return;
                            } else if (!yh1Var.b0) {
                                Vibrator vibrator2 = (Vibrator) yh1Var.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                gl.z3(yh1Var.W);
                                return;
                            } else {
                                gl.d3(oh1Var, 200L);
                                i2 = ((d) yh1Var).currentAccount;
                                na7 q1 = na7.q1(i2);
                                long j2 = yh1Var.k0;
                                String str2 = yh1Var.Z;
                                Runnable runnable = new Runnable(this) {
                                    public final r8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        r8 r8Var = this.b;
                                        switch (b2) {
                                            case 0:
                                                yh1 yh1Var2 = (yh1) r8Var.b;
                                                yh1Var2.l0(false);
                                                i8c i8cVar = yh1Var2.v0;
                                                if (i8cVar != null) {
                                                    i8cVar.a(yh1Var2, Long.valueOf(yh1Var2.k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                yh1 yh1Var3 = (yh1) r8Var.b;
                                                yh1Var3.l0(false);
                                                i8c i8cVar2 = yh1Var3.v0;
                                                if (i8cVar2 != null) {
                                                    i8cVar2.a(yh1Var3, Long.valueOf(yh1Var3.k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable2 = new Runnable(this) {
                                    public final r8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        r8 r8Var = this.b;
                                        switch (b2) {
                                            case 0:
                                                yh1 yh1Var2 = (yh1) r8Var.b;
                                                yh1Var2.l0(false);
                                                i8c i8cVar = yh1Var2.v0;
                                                if (i8cVar != null) {
                                                    i8cVar.a(yh1Var2, Long.valueOf(yh1Var2.k0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                yh1 yh1Var3 = (yh1) r8Var.b;
                                                yh1Var3.l0(false);
                                                i8c i8cVar2 = yh1Var3.v0;
                                                if (i8cVar2 != null) {
                                                    i8cVar2.a(yh1Var3, Long.valueOf(yh1Var3.k0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = q1.f1(j2);
                                tL_channels_updateUsername.username = str2;
                                q1.getConnectionsManager().sendRequest(tL_channels_updateUsername, new p77(q1, j2, str2, runnable, yh1Var, tL_channels_updateUsername, runnable2), 64);
                            }
                        } else {
                            i8c i8cVar = yh1Var.v0;
                            if (i8cVar != null) {
                                i8cVar.a(yh1Var, Long.valueOf(j));
                            }
                        }
                        if (yh1Var.v0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j);
                            bundle.putInt("chatType", 2);
                            yh1Var.presentFragment(new qa5(bundle), true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 22:
                x02 x02Var = (x02) obj;
                p02 p02Var = x02Var.v2;
                if (i == -1) {
                    if (!p02Var.k()) {
                        x02Var.dismiss();
                        return;
                    }
                    return;
                }
                p02Var.x(i);
                return;
            case 23:
                c82 c82Var = (c82) obj;
                if (i == -1 && !c82Var.c0(true)) {
                    c82Var.finishFragment();
                    return;
                }
                return;
            case 24:
                p82 p82Var = (p82) obj;
                if (i == -1) {
                    if (p82Var.b0(true)) {
                        p82Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    p82Var.n0();
                    return;
                } else {
                    return;
                }
            case 25:
                if (i == -1) {
                    ((x92) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i == -1) {
                    ((oc2) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                zc2 zc2Var = (zc2) obj;
                if (i == -1) {
                    if (zc2Var.b0(true)) {
                        zc2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    zc2Var.n0(true);
                    return;
                } else {
                    return;
                }
            case 28:
                kf2 kf2Var = (kf2) obj;
                if (i == -1) {
                    if (kf2Var.g0(true)) {
                        kf2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    kf2Var.x0();
                    return;
                } else {
                    return;
                }
            default:
                uf2 uf2Var = (uf2) obj;
                if (i == -1) {
                    if (uf2Var.onBackPressed(true)) {
                        uf2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    uf2Var.e0();
                    return;
                } else {
                    return;
                }
        }
    }
}
