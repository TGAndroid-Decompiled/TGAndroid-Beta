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
public final class y0 extends FrameLayout implements vlb {
    public final int a;
    public final ylb b;
    public int c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f;
    public final bf0 h;
    public final TextView n;
    public float r;

    public y0(int i, ylb ylbVar, Context context) {
        super(context);
        this.d = true;
        this.a = i;
        this.b = ylbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        bf0 bf0Var = new bf0(context);
        this.h = bf0Var;
        nm7.i(bf0Var);
        linearLayout.addView(bf0Var, qoe.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, qoe.t(-2, -2, 49, 0, 2, 0, 0));
        rve.b(this, 0.05f, 1.5f);
        b(true, 0.0f);
    }

    public final void a(String str, CharSequence charSequence, Long l) {
        int i;
        this.f = true;
        bf0 bf0Var = this.h;
        bf0Var.setColorFilter(null);
        bf0Var.setImageDrawable(gw3.g(str));
        this.n.setText(charSequence);
        int i2 = this.a;
        if (ConnectionsManager.getInstance(i2).isTestBackend()) {
            i = 0;
            while (i < 4) {
                if (z8c.h(i).o() && !ConnectionsManager.getInstance(i).isTestBackend()) {
                    break;
                }
                i++;
            }
        }
        i = i2;
        if (l != null) {
            bf0Var.setAnimatedEmojiDrawable(new vm(9, i2, l.longValue()));
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            hs6.d0(i).m0(tL_inputStickerSetShortName, null, false, false, new x0(this, str, (byte) 0));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.h6));
    }

    public final void b(boolean z, float f) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z && Math.abs(f - this.r) < 0.01f) {
            return;
        }
        this.r = f;
        int i = cmb.F6;
        ylb ylbVar = this.b;
        int v0 = cmb.v0(i, ylbVar);
        int i2 = cmb.Ei;
        int f2 = on2.f(f, v0, cmb.v0(i2, ylbVar));
        int f3 = on2.f(f, cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar));
        if (!this.f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        bf0 bf0Var = this.h;
        bf0Var.setColorFilter(porterDuffColorFilter);
        bf0Var.setEmojiColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        bf0Var.invalidate();
        this.n.setTextColor(f3);
    }

    @Override
    public final void updateColors() {
        int v0;
        b(true, this.r);
        boolean z = this.d;
        ylb ylbVar = this.b;
        if (z) {
            v0 = cmb.p1(0.1f, cmb.v0(cmb.Ei, ylbVar));
        } else {
            v0 = cmb.v0(cmb.h6, ylbVar);
        }
        int i = this.c;
        setBackground(cmb.Y(v0, i, i));
    }
}
