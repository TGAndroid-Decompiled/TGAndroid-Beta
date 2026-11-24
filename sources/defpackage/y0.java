package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class y0 extends FrameLayout implements tjb {
    public final int a;
    public final wjb b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final be0 h;
    public final TextView n;
    public float r;

    public y0(int i, wjb wjbVar, Context context) {
        super(context);
        this.d = true;
        this.a = i;
        this.b = wjbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        be0 be0Var = new be0(context);
        this.h = be0Var;
        kk7.i(be0Var);
        linearLayout.addView(be0Var, nme.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, nme.t(-2, -2, 49, 0, 2, 0, 0));
        ote.b(this, 0.05f, 1.5f);
        b(true, 0.0f);
    }

    public final void a(String str, CharSequence charSequence, Long l) {
        int i;
        this.f = true;
        be0 be0Var = this.h;
        be0Var.setColorFilter(null);
        be0Var.setImageDrawable(vu3.g(str));
        this.n.setText(charSequence);
        int i2 = this.a;
        if (ConnectionsManager.getInstance(i2).isTestBackend()) {
            i = 0;
            while (i < 4) {
                if (y6c.h(i).o() && !ConnectionsManager.getInstance(i).isTestBackend()) {
                    break;
                }
                i++;
            }
        }
        i = i2;
        if (l != null) {
            be0Var.setAnimatedEmojiDrawable(new vl(9, i2, l.longValue()));
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            hq6.d0(i).m0(tL_inputStickerSetShortName, null, false, false, new x0(this, str, (byte) 0));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.h6));
    }

    public final void b(boolean z, float f) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z && Math.abs(f - this.r) < 0.01f) {
            return;
        }
        this.r = f;
        int i = bkb.F6;
        wjb wjbVar = this.b;
        int v0 = bkb.v0(i, wjbVar);
        int i2 = bkb.Ei;
        int f2 = bm2.f(f, v0, bkb.v0(i2, wjbVar));
        int f3 = bm2.f(f, bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar));
        if (!this.f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        be0 be0Var = this.h;
        be0Var.setColorFilter(porterDuffColorFilter);
        be0Var.setEmojiColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        be0Var.invalidate();
        this.n.setTextColor(f3);
    }

    @Override
    public final void updateColors() {
        int v0;
        b(true, this.r);
        boolean z = this.d;
        wjb wjbVar = this.b;
        if (z) {
            v0 = bkb.p1(0.1f, bkb.v0(bkb.Ei, wjbVar));
        } else {
            v0 = bkb.v0(bkb.h6, wjbVar);
        }
        int i = this.c;
        setBackground(bkb.Y(v0, i, i));
    }
}
