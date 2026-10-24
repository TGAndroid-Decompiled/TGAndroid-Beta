package ai;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zr;
public final class y1 extends FrameLayout implements ne.d, org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f2474a;
    public final FrameLayout f2475b;
    public final yh.d1 f2476c;
    public final org.telegram.ui.Components.u9 d;
    public final TextView e;
    public final TextView f2477f;
    public Integer h;
    public TLRPC.Document f2478n;
    public final ne.b f2479r;
    public boolean f2480s;
    public v1 v;

    public y1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f2479r = new ne.b(0, this, zr.h, 320L, false);
        this.f2474a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2475b = frameLayout;
        yh.d1 d1Var = new yh.d1(frameLayout, g6Var, true);
        this.f2476c = d1Var;
        frameLayout.setBackground(d1Var);
        d1Var.f50661w = 1;
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.d = u9Var;
        u9Var.getImageReceiver().setAutoRepeat(0);
        addView(u9Var, w7.z5.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.z5.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f2477f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.z5.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(y1 y1Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        org.telegram.ui.Components.u9 u9Var = y1Var.d;
        if (document == null) {
            u9Var.b();
            y1Var.f2478n = null;
        } else if (y1Var.f2478n == document) {
        } else {
            y1Var.f2478n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21126a7, 0.3f);
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
            u9Var.setLayoutParams(w7.z5.d(i10, i10, 49, 0.0f, i11 + 17, 0.0f, i11));
            u9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    public final void b() {
        int f7;
        yh.d1 d1Var = this.f2476c;
        d1Var.f50664z = null;
        Integer num = this.h;
        ne.b bVar = this.f2479r;
        TextView textView = this.f2477f;
        if (num != null) {
            f7 = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false), org.telegram.ui.ActionBar.k6.o1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.e), this.h.intValue()));
            d1Var.f50664z = this.h;
            this.f2475b.invalidate();
            textView.setTextColor(i0.a.f(bVar.e, this.h.intValue(), -1));
        } else if (this.f2480s) {
            int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            int f10 = i0.a.f(bVar.e, i0.a.f(0.05f, x02, org.telegram.ui.ActionBar.k6.x0(null, i11, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false));
            textView.setTextColor(i0.a.f(bVar.e, i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false)), -1));
            f7 = f10;
        } else {
            f7 = i0.a.f(0.5f, i0.a.o(this.v.f2287a.center_color, 255), i0.a.o(this.v.f2287a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f7);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), f7, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        b();
    }

    @Override
    public final void updateColors() {
        v1 v1Var;
        try {
            if (this.f2477f != null && this.f2475b != null && this.f2476c != null) {
                if (this.h != null || this.f2480s || ((v1Var = this.v) != null && v1Var.f2287a != null)) {
                    b();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
