package bi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class v1 extends FrameLayout implements oe.d, org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f5538a;
    public final FrameLayout f5539b;
    public final zh.d1 f5540c;
    public final org.telegram.ui.Components.y9 d;
    public final TextView e;
    public final TextView f5541f;
    public Integer h;
    public TLRPC.Document f5542n;
    public final oe.b f5543r;
    public boolean f5544s;
    public s1 v;

    public v1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f5543r = new oe.b(0, this, ds.h, 320L, false);
        this.f5538a = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5539b = frameLayout;
        zh.d1 d1Var = new zh.d1(frameLayout, u6Var, true);
        this.f5540c = d1Var;
        frameLayout.setBackground(d1Var);
        d1Var.f53009w = 1;
        addView(frameLayout, kb1.i(-1, -1, 119));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        addView(y9Var, kb1.h(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, kb1.h(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f5541f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, kb1.h(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(v1 v1Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        String str;
        org.telegram.ui.Components.y9 y9Var = v1Var.d;
        if (document == null) {
            y9Var.b();
            v1Var.f5542n = null;
        } else if (v1Var.f5542n == document) {
        } else {
            v1Var.f5542n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.y6.f23300a7, 0.3f);
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
            y9Var.setLayoutParams(kb1.h(i10, i10, 49, 0.0f, i11 + 17, 0.0f, i11));
            y9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        b();
    }

    public final void b() {
        int f7;
        zh.d1 d1Var = this.f5540c;
        d1Var.f53012z = null;
        Integer num = this.h;
        oe.b bVar = this.f5543r;
        TextView textView = this.f5541f;
        if (num != null) {
            f7 = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false), org.telegram.ui.ActionBar.y6.o1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.e), this.h.intValue()));
            d1Var.f53012z = this.h;
            this.f5539b.invalidate();
            textView.setTextColor(i0.a.f(bVar.e, this.h.intValue(), -1));
        } else if (this.f5544s) {
            int i10 = org.telegram.ui.ActionBar.y6.f23357d6;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.y6.G6;
            int f10 = i0.a.f(bVar.e, i0.a.f(0.05f, x02, org.telegram.ui.ActionBar.y6.x0(null, i11, false)), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
            textView.setTextColor(i0.a.f(bVar.e, i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false)), -1));
            f7 = f10;
        } else {
            f7 = i0.a.f(0.5f, i0.a.o(this.v.f5384a.center_color, 255), i0.a.o(this.v.f5384a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f7);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.y6.E1(textView.getBackground(), f7, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void updateColors() {
        s1 s1Var;
        try {
            if (this.f5541f != null && this.f5539b != null && this.f5540c != null) {
                if (this.h != null || this.f5544s || ((s1Var = this.v) != null && s1Var.f5384a != null)) {
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
    public final void z(float f7, int i10) {
    }
}
