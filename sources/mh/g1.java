package mh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;
public final class g1 extends FrameLayout implements xd.b {
    public final org.telegram.ui.ActionBar.g6 f14068a;
    public final FrameLayout f14069b;
    public final lh.u1 f14070c;
    public final org.telegram.ui.Components.p9 d;
    public final TextView f14071e;
    public final TextView f14072f;
    public Integer h;
    public TLRPC.Document f14073n;
    public final xd.a f14074r;
    public boolean f14075s;
    public e1 v;

    public g1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f14074r = new xd.a(0, this, pr.h, 320L, false);
        this.f14068a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14069b = frameLayout;
        lh.u1 u1Var = new lh.u1(frameLayout, g6Var, true);
        this.f14070c = u1Var;
        frameLayout.setBackground(u1Var);
        u1Var.v = 1;
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.getImageReceiver().setAutoRepeat(0);
        addView(p9Var, k7.c6.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f14071e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, k7.c6.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f14072f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, k7.c6.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(g1 g1Var, TLRPC.Document document, int i10, Object obj, boolean z4) {
        String str;
        org.telegram.ui.Components.p9 p9Var = g1Var.d;
        if (document == null) {
            p9Var.b();
            g1Var.f14073n = null;
        } else if (g1Var.f14073n == document) {
        } else {
            g1Var.f14073n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21607a7, 0.3f);
            StringBuilder sb = new StringBuilder();
            sb.append(i10);
            sb.append("_");
            sb.append(i10);
            if (z4) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb.append(str);
            String sb2 = sb.toString();
            int i11 = (80 - i10) / 2;
            p9Var.setLayoutParams(k7.c6.d(i10, i10, 49, 0.0f, i11 + 17, 0.0f, i11));
            p9Var.l(ImageLocation.getForDocument(document), sb2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb2, svgThumb, obj);
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        b();
    }

    public final void b() {
        int d;
        lh.u1 u1Var = this.f14070c;
        u1Var.f13014x = null;
        Integer num = this.h;
        xd.a aVar = this.f14074r;
        TextView textView = this.f14072f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), org.telegram.ui.ActionBar.k6.l1(AndroidUtilities.lerp(0.15f, 1.0f, aVar.f50541e), this.h.intValue()));
            u1Var.f13014x = this.h;
            this.f14069b.invalidate();
            textView.setTextColor(i0.a.d(aVar.f50541e, this.h.intValue(), -1));
        } else if (this.f14075s) {
            int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            int d10 = i0.a.d(aVar.f50541e, i0.a.d(0.05f, w02, org.telegram.ui.ActionBar.k6.w0(null, i11, false)), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
            textView.setTextColor(i0.a.d(aVar.f50541e, i0.a.d(0.5f, org.telegram.ui.ActionBar.k6.w0(null, i10, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.f13932a.center_color, 255), i0.a.k(this.v.f13932a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.k6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
