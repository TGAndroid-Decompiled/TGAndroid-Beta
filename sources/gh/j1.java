package gh;

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
import org.telegram.ui.Components.gr;
public final class j1 extends FrameLayout implements td.b {
    public final org.telegram.ui.ActionBar.b6 f8324a;
    public final FrameLayout f8325b;
    public final fh.b2 f8326c;
    public final org.telegram.ui.Components.o9 d;
    public final TextView f8327e;
    public final TextView f8328f;
    public Integer h;
    public TLRPC.Document f8329n;
    public final td.a f8330r;
    public boolean f8331s;
    public g1 v;

    public j1(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f8330r = new td.a(0, this, gr.h, 320L, false);
        this.f8324a = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8325b = frameLayout;
        fh.b2 b2Var = new fh.b2(frameLayout, b6Var, true);
        this.f8326c = b2Var;
        frameLayout.setBackground(b2Var);
        b2Var.v = 1;
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.getImageReceiver().setAutoRepeat(0);
        addView(o9Var, g7.e6.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f8327e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, g7.e6.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f8328f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, g7.e6.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(j1 j1Var, TLRPC.Document document, int i9, Object obj, boolean z10) {
        String str;
        org.telegram.ui.Components.o9 o9Var = j1Var.d;
        if (document == null) {
            o9Var.b();
            j1Var.f8329n = null;
        } else if (j1Var.f8329n == document) {
        } else {
            j1Var.f8329n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.f22947a7, 0.3f);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i9);
            sb2.append("_");
            sb2.append(i9);
            if (z10) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            int i10 = (80 - i9) / 2;
            o9Var.setLayoutParams(g7.e6.d(i9, i9, 49, 0.0f, i10 + 17, 0.0f, i10));
            o9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        b();
    }

    public final void b() {
        int d;
        fh.b2 b2Var = this.f8326c;
        b2Var.f6380x = null;
        Integer num = this.h;
        td.a aVar = this.f8330r;
        TextView textView = this.f8328f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), org.telegram.ui.ActionBar.f6.l1(AndroidUtilities.lerp(0.15f, 1.0f, aVar.f47775e), this.h.intValue()));
            b2Var.f6380x = this.h;
            this.f8325b.invalidate();
            textView.setTextColor(i0.a.d(aVar.f47775e, this.h.intValue(), -1));
        } else if (this.f8331s) {
            int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            int d9 = i0.a.d(aVar.f47775e, i0.a.d(0.05f, w02, org.telegram.ui.ActionBar.f6.w0(null, i10, false)), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
            textView.setTextColor(i0.a.d(aVar.f47775e, i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, i9, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false)), -1));
            d = d9;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.f8090a.center_color, 255), i0.a.k(this.v.f8090a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.f6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
