package ag;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import hh.i5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.qh0;
import org.telegram.ui.rh0;
import org.telegram.ui.vh1;

public final class i extends yk0 {

    public final int f426c;
    public final Object d;

    public i(Object obj, int i10) {
        this.f426c = i10;
        this.d = obj;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        switch (this.f426c) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            default:
                return true;
        }
    }

    public void F(int i10, int i11) {
        int[] iArr = ((i5) this.d).L0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override
    public final int h() {
        int i10 = this.f426c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((o) obj).d.size();
            case 1:
                return ((i5) obj).L0.length;
            case 2:
                return 1;
            case 3:
                return ((um0) obj).f33132r.size();
            case 4:
                return ((rh0) obj).f41935c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.f36299g0;
                return 12;
            default:
                return ((pf.g0) obj).T2.size();
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f426c) {
            case 0:
                return ((m) ((o) this.d).d.get(i10)).f553a;
            case 1:
            default:
                return super.j(i10);
            case 2:
                return i10;
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        switch (this.f426c) {
            case 0:
                o oVar = (o) this.d;
                ArrayList arrayList = oVar.d;
                if (((m) arrayList.get(i10)).f553a == 1) {
                    n nVar = (n) o1Var.f5789a;
                    nVar.f565c.setColorFilter(new PorterDuffColorFilter(oVar.f576e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    nVar.f565c.setImageDrawable(oVar.getContext().getDrawable(((m) arrayList.get(i10)).f554b));
                    nVar.f563a.setText(((m) arrayList.get(i10)).f555c);
                    nVar.f564b.setText(((m) arrayList.get(i10)).d);
                }
                break;
            case 1:
                int[] iArr = ((i5) this.d).L0;
                int length = (iArr.length - 1) - i10;
                ja jaVar = (ja) o1Var.f5789a;
                int i11 = iArr[length];
                if (jaVar.f29659a != i11) {
                    jaVar.f29659a = i11;
                    jaVar.requestLayout();
                }
                break;
            case 2:
                break;
            case 3:
                View view = o1Var.f5789a;
                um0 um0Var = (um0) this.d;
                ArrayList arrayList2 = um0Var.f33132r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    rm0 rm0Var = (rm0) arrayList2.get(i10);
                    tm0 tm0Var = (tm0) view;
                    ig.q0 q0Var = tm0Var.d;
                    boolean z10 = q0Var == null || !q0Var.equals(rm0Var.f32207a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = rm0Var.f32207a.g();
                        tL_reactionCount.count = rm0Var.f32208b;
                        um0 um0Var2 = tm0Var.f32842s;
                        sm0 sm0Var = new sm0(tm0Var, um0Var2.f33126a, tm0Var, tL_reactionCount, um0Var2.f33128c);
                        tm0Var.f32835a = sm0Var;
                        sm0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        sm0 sm0Var2 = tm0Var.f32835a;
                        sm0Var2.f11398q = true;
                        sm0Var2.S = true;
                    } else {
                        tm0Var.f32835a.f11403w = rm0Var.f32208b;
                    }
                    tm0Var.d = rm0Var.f32207a;
                    if (!z10) {
                        sm0 sm0Var3 = tm0Var.f32835a;
                        sm0Var3.f11386f = sm0Var3.A;
                    }
                    tm0Var.f32835a.A = AndroidUtilities.dp(44.33f);
                    tm0Var.f32835a.f11402u = !TextUtils.isEmpty(rm0Var.f32209c);
                    sm0 sm0Var4 = tm0Var.f32835a;
                    boolean z11 = sm0Var4.f11402u;
                    i6 i6Var = sm0Var4.G;
                    if (z11) {
                        i6Var.q(Emoji.replaceEmoji(rm0Var.f32209c, i6Var.f29238a.getFontMetricsInt(), false), !z10, true);
                    } else if (i6Var != null) {
                        i6Var.q("", !z10, true);
                    }
                    sm0 sm0Var5 = tm0Var.f32835a;
                    Integer.toString(rm0Var.f32208b);
                    sm0Var5.getClass();
                    tm0Var.f32835a.F.c(rm0Var.f32208b, !z10);
                    sm0 sm0Var6 = tm0Var.f32835a;
                    jq jqVar = sm0Var6.F;
                    if (jqVar != null && (sm0Var6.f11403w > 0 || sm0Var6.f11402u)) {
                        sm0Var6.A = (int) (AndroidUtilities.dp(tm0Var.f32835a.f11402u ? 4.0f : 0.0f) + ((int) Math.ceil(jqVar.f29785m)) + tm0Var.f32835a.G.d + sm0Var6.A);
                    }
                    if (z10) {
                        sm0 sm0Var7 = tm0Var.f32835a;
                        sm0Var7.f11386f = sm0Var7.A;
                    }
                    tm0Var.f32835a.B = AndroidUtilities.dp(28.0f);
                    sm0 sm0Var8 = tm0Var.f32835a;
                    sm0Var8.f11397p = tm0Var.f32838e;
                    if (tm0Var.f32841r) {
                        sm0Var8.a();
                    }
                    if (!z10) {
                        tm0Var.requestLayout();
                    }
                    ((tm0) view).a(rm0Var.f32207a.h == um0Var.h, false);
                    break;
                }
                break;
            case 4:
                qh0 qh0Var = (qh0) o1Var.f5789a;
                rh0 rh0Var = (rh0) this.d;
                qh0Var.a((TLObject) rh0Var.f41935c.get(i10), false, ((Integer) rh0Var.f41934b.get(i10)).intValue());
                break;
            case 5:
                ((vh1) o1Var.f5789a).f43464a = WallpapersListActivity.f36301i0[i10];
                break;
            default:
                ((pf.f0) o1Var).v.setData((pf.e0) ((pf.g0) this.d).T2.get(i10));
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View q3Var;
        switch (this.f426c) {
            case 0:
                o oVar = (o) this.d;
                c6 c6Var = oVar.f291a;
                if (i10 == 0) {
                    q3Var = new l(oVar, oVar.getContext());
                } else if (i10 == 2) {
                    q3Var = new q3(oVar.getContext(), 16);
                } else {
                    Context context = oVar.getContext();
                    n nVar = new n(context);
                    ImageView imageView = new ImageView(context);
                    nVar.f565c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    nVar.addView(imageView, z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    nVar.f563a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    rl.l(g6.G6, c6Var, textView, 1, 14.0f);
                    nVar.addView(textView, z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    nVar.f564b = textView2;
                    rl.l(g6.f23423y6, c6Var, textView2, 1, 14.0f);
                    nVar.addView(textView2, z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    q3Var = nVar;
                }
                return pa.l(q3Var, q3Var, -1, -2);
            case 1:
                ja jaVar = new ja(((i5) this.d).getContext());
                jaVar.f29659a = 0;
                return new lk0(jaVar);
            case 2:
                return new lk0(((ka) this.d).T);
            case 3:
                um0 um0Var = (um0) this.d;
                return new lk0(new tm0(um0Var, um0Var.getContext()));
            case 4:
                qh0 qh0Var = new qh0(viewGroup.getContext());
                qh0Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(50.0f)));
                return new lk0(qh0Var);
            case 5:
                ai1 ai1Var = (ai1) this.d;
                return new lk0(new vh1(ai1Var.A, ai1Var.f36542c));
            default:
                pf.d0 d0Var = new pf.d0(viewGroup.getContext(), ((pf.g0) this.d).f35277l2);
                pf.f0 f0Var = new pf.f0(d0Var);
                f0Var.v = d0Var;
                d0Var.setLayoutParams(new f2.y0(-2, AndroidUtilities.dp(30.0f)));
                return f0Var;
        }
    }

    @Override
    public void y(f2.o1 o1Var) {
        switch (this.f426c) {
            case 3:
                um0 um0Var = (um0) this.d;
                ArrayList arrayList = um0Var.f33132r;
                int iB = o1Var.b();
                if (iB >= 0 && iB < arrayList.size()) {
                    ((tm0) o1Var.f5789a).a(((rm0) arrayList.get(iB)).f32207a.h == um0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(f2.o1 o1Var, int i10) {
    }
}
