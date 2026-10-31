package og;

import ag.t0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class h extends d implements k6 {
    public int D;
    public final ImageView f14198s;
    public g f14199w;
    public TLRPC.Chat f14200x;
    public boolean f14201y;

    public h(Context context, p6 p6Var) {
        super(context, p6Var);
        int i10;
        float f7;
        float f10;
        float f11;
        this.d.setTypeface(i0.o());
        ImageView imageView = new ImageView(context);
        this.f14198s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = t6.x0(null, t6.Ji, false);
        this.D = x02;
        imageView.setBackground(t6.h0(x02, 1, -1));
        imageView.setImageResource(2131232558);
        a7.t(imageView, t6.f21095m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(cd.L0(2131751599, null));
        boolean z10 = cd.X;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i11 = i10 | 17;
        if (z10) {
            f7 = 3.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 3.0f;
        }
        addView(imageView, b6.d(48, 50.0f, i11, f7, 0.0f, f10, 0.0f));
        c cVar = this.d;
        if (cd.X) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        cVar.setPadding(i0.L(f11), 0, i0.L(cd.X ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z10, int i11) {
        String str;
        int i12;
        String L0;
        String str2;
        this.f14201y = z10;
        this.f14200x = chat;
        r8 r8Var = this.f14177b;
        r8Var.q(chat);
        int L = i0.L(20.0f);
        g9 g9Var = this.f14178c;
        g9Var.setRoundRadius(L);
        g9Var.e(chat, r8Var);
        String str3 = chat.title;
        c cVar = this.d;
        cVar.k(org.telegram.messenger.k6.m(str3, cVar.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = w3.V(chat);
        if (z10) {
            if (i11 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                L0 = cd.G(i11, str2, new Object[0]);
            } else {
                if (V) {
                    i12 = 2131751391;
                } else {
                    i12 = 2131754876;
                }
                L0 = cd.L0(i12, null);
            }
            setSubtitle(L0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(cd.G(i10, str, new Object[0]));
        }
        a7.Y(this.e, t6.f21185r5, this.f14176a);
        setDivider(true);
        ImageView imageView = this.f14198s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new t0(12, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f14200x;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f14198s.measure(View.MeasureSpec.makeMeasureSpec(i0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(g gVar) {
        this.f14199w = gVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = t6.x0(null, t6.Ji, false);
            ImageView imageView = this.f14198s;
            if (imageView != null && x02 != this.D) {
                this.D = x02;
                t6.H1(imageView.getBackground(), x02, true);
                imageView.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
