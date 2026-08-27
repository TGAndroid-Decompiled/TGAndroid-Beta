package lh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b70;

public final class b0 implements Runnable {

    public final int f15671a;

    public final e0 f15672b;

    public b0(e0 e0Var, int i10) {
        this.f15671a = i10;
        this.f15672b = e0Var;
    }

    @Override
    public final void run() {
        ag.o3 o3Var;
        long j10;
        ag.o3 o3Var2;
        boolean z10;
        float f10;
        u uVar;
        ag.o3 o3Var3;
        switch (this.f15671a) {
            case 0:
                e0 e0Var = this.f15672b;
                if (!e0Var.f15890a0 && !e0Var.f15903j0) {
                    d0 d0Var = e0Var.f15899f0;
                    if (d0Var != null && (o3Var = d0Var.d) != null) {
                        o3Var.setVolume(0.0f);
                    }
                    d0 d0Var2 = e0Var.f15894c0;
                    e0Var.f15899f0 = d0Var2;
                    if (d0Var2 != null && d0Var2.f15846n != null) {
                        Runnable runnable = e0Var.f15901h0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        d0 d0Var3 = e0Var.f15899f0;
                        ag.o3 o3Var4 = d0Var3.d;
                        if (o3Var4 != null) {
                            o3Var4.setVolume(d0Var3.f15846n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(e0Var.getContext());
                        ImageView imageView = new ImageView(e0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(e0Var.getContext());
                        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        b70 b70VarF = b70.F(e0Var.f15889a, e0Var.f15891b, e0Var);
                        if (e0Var.f15899f0.f15846n.K) {
                            t7 t7Var = new t7(e0Var.getContext(), 0);
                            t7Var.f16862b = 0.0f;
                            t7Var.f16863c = 1.5f;
                            t7Var.d(e0Var.f15899f0.f15846n.P);
                            t7Var.h = new ag.n0(e0Var, 25);
                            t7Var.N = AndroidUtilities.dp(220.0f);
                            b70VarF.q(t7Var);
                            b70VarF.o();
                        }
                        b70VarF.T = 220;
                        b70VarF.c(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new b0(e0Var, 4), false);
                        b70VarF.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new b0(e0Var, 5), true);
                        b70VarF.o();
                        b70VarF.r(frameLayout, h7.z5.n(220, -2));
                        b70VarF.f26987p = new ag.l3(15);
                        b70VarF.f26974i = 1;
                        b70VarF.V = true;
                        b70VarF.f26994u = true;
                        b70VarF.v = false;
                        int iDp = AndroidUtilities.dp(12.0f);
                        int iDp2 = AndroidUtilities.dp(10.0f);
                        b70VarF.f26980l = iDp;
                        b70VarF.f26978k = iDp2;
                        b70VarF.f26987p = new b0(e0Var, 6);
                        b70VarF.Z();
                        try {
                            e0Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                this.f15672b.invalidate();
                break;
            case 2:
                e0 e0Var2 = this.f15672b;
                if (e0Var2.f15892b0) {
                    e0Var2.f15892b0 = false;
                    e0Var2.invalidate();
                }
                break;
            case 3:
                e0 e0Var3 = this.f15672b;
                long position = e0Var3.getPosition();
                d0 mainPart = e0Var3.getMainPart();
                if (mainPart == null) {
                    j10 = 0;
                } else {
                    z7 z7Var = mainPart.f15846n;
                    j10 = z7Var.X + ((long) (z7Var.V * z7Var.f17211h0));
                }
                for (int i10 = 0; i10 < e0Var3.h.size(); i10++) {
                    d0 d0Var4 = (d0) e0Var3.h.get(i10);
                    if (d0Var4.f15846n != null && (o3Var2 = d0Var4.d) != null) {
                        long duration = o3Var2.getDuration();
                        long jClamp = Utilities.clamp((position + j10) - d0Var4.f15846n.X, duration, 0L);
                        if (!e0Var3.f15903j0 || e0Var3.m0) {
                            float f11 = jClamp;
                            z7 z7Var2 = d0Var4.f15846n;
                            float f12 = duration;
                            if (f11 <= z7Var2.V * f12 || f11 >= z7Var2.W * f12) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else {
                            z10 = false;
                        }
                        z7 z7Var3 = d0Var4.f15846n;
                        float f13 = duration;
                        long jClamp2 = Utilities.clamp(jClamp, (long) (z7Var3.W * f13), (long) (z7Var3.V * f13));
                        if (d0Var4.d.isPlaying() != z10) {
                            if (z10) {
                                d0Var4.d.play();
                            } else {
                                d0Var4.d.pause();
                            }
                        }
                        ag.o3 o3Var5 = d0Var4.d;
                        if (e0Var3.f15912r0) {
                            f10 = 0.0f;
                        } else {
                            z7 z7Var4 = d0Var4.f15846n;
                            if (z7Var4.Y || !e0Var3.f15903j0) {
                                f10 = 0.0f;
                            } else {
                                f10 = z7Var4.P;
                            }
                        }
                        o3Var5.setVolume(f10);
                        if (Math.abs((d0Var4.f15840g >= 0 ? d0Var4.f15840g : d0Var4.d.getCurrentPosition()) - jClamp2) > 450 && d0Var4.f15840g < 0) {
                            ag.o3 o3Var6 = d0Var4.d;
                            d0Var4.f15840g = jClamp2;
                            o3Var6.seekTo(jClamp2, e0Var3.f15905l0, new kh.c(d0Var4, 4));
                        }
                    }
                }
                cc ccVar = e0Var3.f15907n0;
                if (ccVar != null) {
                    ccVar.setProgress(position);
                }
                q6 q6Var = e0Var3.f15908o0;
                if (q6Var != null) {
                    q6Var.w(true);
                    e0Var3.f15908o0.y(true);
                }
                if (e0Var3.f15903j0 && e0Var3.m0) {
                    AndroidUtilities.runOnUIThread(e0Var3.f15914s0, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    break;
                }
                break;
            case 4:
                e0 e0Var4 = this.f15672b;
                d0 d0Var5 = e0Var4.f15899f0;
                if (d0Var5 != null) {
                    d0Var5.a(null);
                    e0Var4.q();
                    e0Var4.invalidate();
                    Runnable runnable2 = e0Var4.f15902i0;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    break;
                }
                break;
            case 5:
                e0 e0Var5 = this.f15672b;
                d0 d0Var6 = e0Var5.f15899f0;
                if (d0Var6 != null && e0Var5.h.indexOf(d0Var6) >= 0) {
                    u uVar2 = e0Var5.f15898f;
                    int iIndexOf = uVar2.f16885e.indexOf(d0Var6.h);
                    ArrayList arrayList = uVar2.f16885e;
                    if (iIndexOf < 0 || iIndexOf >= arrayList.size()) {
                        uVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(iIndexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            t tVar = (t) arrayList2.get(i12);
                            if (tVar.f16830c != i11) {
                                sb2.append("/");
                                i11 = tVar.f16830c;
                            }
                            sb2.append(".");
                        }
                        uVar = new u(sb2.toString());
                    }
                    if (uVar.f16885e.size() <= 1) {
                        e0Var5.e();
                        e0Var5.invalidate();
                    }
                    e0Var5.o(uVar);
                    e0Var5.f15892b0 = true;
                    e0Var5.q();
                    e0Var5.invalidate();
                    Runnable runnable3 = e0Var5.f15902i0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    sb sbVar = ((gb) e0Var5).f16045u0;
                    sbVar.E0.a(false, true);
                    if (uVar.f16885e.size() > 1) {
                        a0 a0Var = sbVar.C0;
                        sbVar.f16810v0 = uVar;
                        a0Var.a(new v(uVar, false), true);
                        sbVar.C0.b(true, true);
                    } else {
                        sbVar.C0.b(false, true);
                    }
                    sbVar.m0(true);
                    sa saVar = sbVar.I0;
                    if (saVar != null) {
                        saVar.setMultipleOnClick(sbVar.f16814w0.j());
                        sbVar.I0.setMaxCount(Math.min(10, u.b() - sbVar.f16814w0.getFilledCount()));
                    }
                }
                break;
            default:
                d0 d0Var7 = this.f15672b.f15899f0;
                if (d0Var7 != null && (o3Var3 = d0Var7.d) != null) {
                    o3Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
