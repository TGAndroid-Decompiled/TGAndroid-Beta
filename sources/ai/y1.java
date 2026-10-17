package ai;

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
import org.telegram.ui.Components.bs;
public final class y1 extends FrameLayout implements ne.d {
    public final org.telegram.ui.ActionBar.d6 f2470a;
    public final FrameLayout f2471b;
    public final yh.e1 f2472c;
    public final org.telegram.ui.Components.w9 d;
    public final TextView e;
    public final TextView f2473f;
    public Integer h;
    public TLRPC.Document f2474n;
    public final ne.b f2475r;
    public boolean f2476s;
    public v1 v;

    public y1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f2475r = new ne.b(0, this, bs.h, 320L, false);
        this.f2470a = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2471b = frameLayout;
        yh.e1 e1Var = new yh.e1(frameLayout, d6Var, true);
        this.f2472c = e1Var;
        frameLayout.setBackground(e1Var);
        e1Var.v = 1;
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.getImageReceiver().setAutoRepeat(0);
        addView(w9Var, w7.z5.a(80.0f, 0.0f, 17.0f, 0.0f, 0.0f, 80, 49));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.z5.a(-2.0f, 12.0f, 106.0f, 12.0f, 14.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.f2473f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.z5.a(-2.0f, 0.0f, 10.0f, 10.0f, 0.0f, -2, 53));
    }

    public static void a(y1 y1Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        org.telegram.ui.Components.w9 w9Var = y1Var.d;
        if (document == null) {
            w9Var.b();
            y1Var.f2474n = null;
        } else if (y1Var.f2474n == document) {
        } else {
            y1Var.f2474n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f20928a7, 0.3f);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("_");
            sb2.append(i10);
            if (z10) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            int i11 = (80 - i10) / 2;
            w9Var.setLayoutParams(w7.z5.a(i10, 0.0f, i11 + 17, 0.0f, i11, i10, 49));
            w9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    public final void b() {
        int f7;
        yh.e1 e1Var = this.f2472c;
        e1Var.f50246x = null;
        Integer num = this.h;
        ne.b bVar = this.f2475r;
        TextView textView = this.f2473f;
        if (num != null) {
            f7 = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false), org.telegram.ui.ActionBar.h6.m1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.e), this.h.intValue()));
            e1Var.f50246x = this.h;
            this.f2471b.invalidate();
            textView.setTextColor(i0.b.f(bVar.e, this.h.intValue(), -1));
        } else if (this.f2476s) {
            int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            int f10 = i0.b.f(bVar.e, i0.b.f(0.05f, x02, org.telegram.ui.ActionBar.h6.x0(null, i11, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            textView.setTextColor(i0.b.f(bVar.e, i0.b.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false)), -1));
            f7 = f10;
        } else {
            f7 = i0.b.f(0.5f, i0.b.o(this.v.f2284a.center_color, 255), i0.b.o(this.v.f2284a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f7);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.h6.C1(textView.getBackground(), f7, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        b();
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
