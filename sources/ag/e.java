package ag;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.nm;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.vs;
import org.telegram.ui.ad;
import org.telegram.ui.cp;
import org.telegram.ui.dc;
import org.telegram.ui.h8;
import org.telegram.ui.ic;
import org.telegram.ui.iq;
import org.telegram.ui.j6;
import org.telegram.ui.j9;
import org.telegram.ui.jc;
import org.telegram.ui.kd;
import org.telegram.ui.l01;
import org.telegram.ui.oa;
import org.telegram.ui.oo;
import org.telegram.ui.p4;
import org.telegram.ui.qp;
import org.telegram.ui.s9;
import org.telegram.ui.sb;
import org.telegram.ui.u9;
import org.telegram.ui.v50;
import org.telegram.ui.x5;
import org.telegram.ui.xp;
import org.telegram.ui.y6;
import org.telegram.ui.z9;
import org.telegram.ui.zc;
public final class e extends org.telegram.ui.ActionBar.k {
    public final int f488a;
    public final Object f489b;

    public e(Object obj, int i10) {
        this.f488a = i10;
        this.f489b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f488a;
        Object obj = this.f489b;
        switch (i11) {
            case 0:
                f fVar = (f) obj;
                if (i10 == -1) {
                    if (fVar.onBackPressed(true)) {
                        fVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    fVar.b0();
                    return;
                } else {
                    return;
                }
            case 1:
                w wVar = (w) obj;
                if (i10 == -1) {
                    if (wVar.onBackPressed(true)) {
                        wVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    wVar.l0();
                    return;
                } else {
                    return;
                }
            case 2:
                t1 t1Var = (t1) obj;
                if (i10 == -1) {
                    if (t1Var.onBackPressed(true)) {
                        t1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    t1Var.e0();
                    return;
                } else {
                    return;
                }
            case 3:
                v1 v1Var = (v1) obj;
                if (i10 == -1) {
                    if (v1Var.onBackPressed(true)) {
                        v1Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    v1Var.b0();
                    return;
                } else {
                    return;
                }
            case 4:
                f2 f2Var = (f2) obj;
                if (i10 == -1) {
                    if (f2Var.onBackPressed(true)) {
                        f2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    f2Var.a0();
                    return;
                } else {
                    return;
                }
            case 5:
                h2 h2Var = (h2) obj;
                if (i10 == -1) {
                    if (h2Var.onBackPressed(true)) {
                        h2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    h2Var.h0();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((j2) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                z2 z2Var = (z2) obj;
                ArrayList arrayList = z2Var.f821b;
                if (i10 == -1) {
                    if (arrayList.isEmpty()) {
                        z2Var.finishFragment();
                        return;
                    } else {
                        z2.b0(z2Var);
                        return;
                    }
                } else if (i10 == 1) {
                    if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        h3 c10 = i3.f(z2.c0(z2Var)).c(intValue);
                        if (c10 != null) {
                            z2.h0(z2Var.getParentActivity(), z2.d0(z2Var), null, c10, z2.e0(z2Var), new s2(this, intValue, 0));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z2Var.getParentActivity(), z2Var.getResourceProvider());
                    String G = cd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = G;
                    x1Var.T = cd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.k(cd.L0(2131746336, null), new a1.c(this, 4));
                    alertDialog$Builder.h(cd.L0(2131752589, null), null);
                    z2Var.showDialog(x1Var);
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((m3) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((kg.i1) obj).dismiss();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.f) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.j) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.n) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((l01) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((p4) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((x5) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                y6 y6Var = (y6) obj;
                if (i10 == -1) {
                    if (y6.d0(y6Var).s()) {
                        sh.b bVar = y6Var.f43721d0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        j6 j6Var = y6Var.M;
                        if (j6Var != null) {
                            j6Var.f(false);
                            y6Var.M.e();
                            return;
                        }
                        return;
                    }
                    y6Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    y6.j0(y6Var);
                    return;
                } else if (i10 == 3) {
                    y6.k0(y6Var, false);
                    return;
                } else if (i10 == 4) {
                    y6.k0(y6Var, true);
                    return;
                } else {
                    return;
                }
            case 17:
                h8 h8Var = (h8) obj;
                if (i10 == -1) {
                    if (h8Var.P == 0 && h8Var.Q == 0 && !h8Var.G) {
                        h8Var.finishFragment();
                        return;
                    }
                    h8Var.G = false;
                    h8Var.P = 0;
                    h8Var.Q = 0;
                    h8Var.A0();
                    h8Var.t0();
                    return;
                }
                return;
            case 18:
                j9 j9Var = (j9) obj;
                if (i10 == -1) {
                    if (j9.c0(j9Var).s()) {
                        j9Var.i0(true);
                        return;
                    } else {
                        j9Var.finishFragment();
                        return;
                    }
                } else if (i10 == 2) {
                    j9.d0(j9Var, false);
                    return;
                } else if (i10 == 3) {
                    j9.d0(j9Var, true);
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((u9) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                z9 z9Var = (z9) obj;
                if (i10 == -1) {
                    z9Var.finishFragment();
                    return;
                } else if (i10 == 1 && z9Var.f44051a.getText().length() != 0) {
                    z9.Y(z9Var);
                    z9Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 21:
                oa oaVar = (oa) obj;
                if (i10 == -1) {
                    oaVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    oa.c0(oaVar);
                    oa.d0(oaVar);
                    return;
                } else {
                    return;
                }
            case 22:
                if (i10 == -1) {
                    ((sb) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                zc zcVar = (zc) obj;
                if (i10 == -1) {
                    if (zcVar.f44088b >= zcVar.Y0() && zcVar.W0()) {
                        zcVar.b1();
                        return;
                    } else {
                        zcVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) zcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    zcVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    zcVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    zcVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    ic icVar = new ic(zcVar, zcVar.getParentActivity(), canvas, (zcVar.L.getMeasuredWidth() / 2.0f) + f7, (zcVar.L.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16021n, paint, createBitmap, paint2, f7, f10, 0);
                    zcVar.m0 = icVar;
                    icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                    zcVar.f44103n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    zcVar.f44104o0 = ofFloat;
                    ofFloat.addUpdateListener(new jc(zcVar, 0));
                    zcVar.f44104o0.addListener(new s9(zcVar, 14));
                    zcVar.f44104o0.setDuration(400L);
                    zcVar.f44104o0.setInterpolator(vs.e);
                    zcVar.f44104o0.start();
                    frameLayout.addView(zcVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.i0.g3(new dc(zcVar, 0));
                    return;
                } else {
                    return;
                }
            case 24:
                kd kdVar = (kd) obj;
                long j10 = kdVar.f38756j0;
                ad adVar = kdVar.f38772w0;
                if (i10 == -1) {
                    if (kdVar.f38767s0) {
                        kd.c0(kdVar);
                        return;
                    } else {
                        kdVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1) {
                    int i12 = kdVar.f38755i0;
                    if (i12 == 0) {
                        if (kdVar.getParentActivity() != null) {
                            if (kdVar.f38767s0) {
                                kd.c0(kdVar);
                                return;
                            } else if (kdVar.d.f32239a.length() == 0) {
                                Vibrator vibrator = (Vibrator) kdVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.i0.E3(kdVar.d);
                                return;
                            } else {
                                kdVar.f38767s0 = true;
                                org.telegram.messenger.i0.h3(adVar, 200L);
                                if (kdVar.f38773x.g()) {
                                    kdVar.f38765r0 = true;
                                    return;
                                } else {
                                    kdVar.f38768t0 = Integer.valueOf(vp.r1(kd.g0(kdVar)).U(kdVar.d.getText().toString(), new ArrayList(), kdVar.f38775y.getText().toString(), 2, false, null, null, -1, kdVar));
                                    return;
                                }
                            }
                        }
                        return;
                    } else if (i12 == 1) {
                        if (!kdVar.f38746b0) {
                            if (kdVar.f38775y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kdVar.getParentActivity());
                                String L0 = cd.L0(2131752316, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                x1Var2.R = L0;
                                x1Var2.T = cd.L0(2131752317, null);
                                alertDialog$Builder2.k(cd.L0(2131752041, null), null);
                                kdVar.showDialog(x1Var2);
                                return;
                            } else if (!kdVar.f38744a0) {
                                Vibrator vibrator2 = (Vibrator) kdVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                org.telegram.messenger.i0.E3(kdVar.V);
                                return;
                            } else {
                                org.telegram.messenger.i0.h3(adVar, 200L);
                                vp r12 = vp.r1(kd.d0(kdVar));
                                long j11 = kdVar.f38756j0;
                                String str = kdVar.Y;
                                Runnable runnable = new Runnable(this) {
                                    public final ag.e f37230b;

                                    {
                                        this.f37230b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                kd kdVar2 = (kd) this.f37230b.f489b;
                                                kdVar2.l0(false);
                                                org.telegram.messenger.j20 j20Var = kdVar2.f38769u0;
                                                if (j20Var != null) {
                                                    j20Var.a(kdVar2, Long.valueOf(kdVar2.f38756j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                kd kdVar3 = (kd) this.f37230b.f489b;
                                                kdVar3.l0(false);
                                                org.telegram.messenger.j20 j20Var2 = kdVar3.f38769u0;
                                                if (j20Var2 != null) {
                                                    j20Var2.a(kdVar3, Long.valueOf(kdVar3.f38756j0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                Runnable runnable2 = new Runnable(this) {
                                    public final ag.e f37230b;

                                    {
                                        this.f37230b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                kd kdVar2 = (kd) this.f37230b.f489b;
                                                kdVar2.l0(false);
                                                org.telegram.messenger.j20 j20Var = kdVar2.f38769u0;
                                                if (j20Var != null) {
                                                    j20Var.a(kdVar2, Long.valueOf(kdVar2.f38756j0));
                                                    return;
                                                }
                                                return;
                                            default:
                                                kd kdVar3 = (kd) this.f37230b.f489b;
                                                kdVar3.l0(false);
                                                org.telegram.messenger.j20 j20Var2 = kdVar3.f38769u0;
                                                if (j20Var2 != null) {
                                                    j20Var2.a(kdVar3, Long.valueOf(kdVar3.f38756j0));
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = r12.g1(j11);
                                tL_channels_updateUsername.username = str;
                                r12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new nm(r12, j11, str, runnable, kdVar, tL_channels_updateUsername, runnable2), 64);
                            }
                        } else {
                            j20 j20Var = kdVar.f38769u0;
                            if (j20Var != null) {
                                j20Var.a(kdVar, Long.valueOf(j10));
                            }
                        }
                        if (kdVar.f38769u0 == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", j10);
                            bundle.putInt("chatType", 2);
                            kdVar.presentFragment(new v50(bundle), true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 25:
                oo ooVar = (oo) obj;
                if (i10 == -1) {
                    if (ooVar.i0(true)) {
                        ooVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    ooVar.n0();
                    return;
                } else {
                    return;
                }
            case 26:
                cp cpVar = (cp) obj;
                if (i10 == -1) {
                    cpVar.finishFragment();
                    return;
                } else if (i10 == 1) {
                    l5 l5Var = cpVar.f36517r;
                    if (l5Var == null || !l5Var.f20547y.f7021f) {
                        cpVar.d0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 27:
                if (i10 == -1) {
                    ((qp) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((xp) obj).finishFragment();
                    return;
                }
                return;
            default:
                iq iqVar = (iq) obj;
                if (i10 == -1) {
                    if (iqVar.q0(true)) {
                        iqVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    iqVar.v0(true);
                    return;
                } else {
                    return;
                }
        }
    }
}
