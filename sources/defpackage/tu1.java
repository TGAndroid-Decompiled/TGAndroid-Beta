package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class tu1 implements ResultCallback, fd {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public tu1(xu1 xu1Var, ez3 ez3Var, boolean z, hh7 hh7Var, int i) {
        this.c = xu1Var;
        this.d = ez3Var;
        this.b = z;
        this.e = hh7Var;
        this.a = i;
    }

    @Override
    public final void onComplete(Object obj) {
        xu1 xu1Var = (xu1) this.c;
        ez3 ez3Var = (ez3) this.d;
        hh7 hh7Var = (hh7) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((avc) pair.second).a;
            ez3 ez3Var2 = xu1Var.f;
            if (ez3Var2 != null && longValue == ez3Var2.h(xu1Var.q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = xu1Var.i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i = ez3Var.j(this.b ? 1 : 0).settings.intensity;
                List list = ((avc) pair.second).b;
                hh7Var.R = list;
                long j = xu1Var.G.ob;
                if (list != null) {
                    hh7Var.S = new Random(j).nextInt(hh7Var.R.size());
                }
                hh7Var.r(i, bitmap);
                hh7Var.s(this.a);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xu1Var.i = ofFloat;
                ofFloat.addUpdateListener(new su1(hh7Var, (byte) 2));
                xu1Var.i.setDuration(250L);
                xu1Var.i.start();
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        String charSequence;
        q84 q84Var = (q84) this.c;
        m84 m84Var = (m84) this.d;
        r47 r47Var = (r47) this.e;
        if (m84Var.getText().toString().length() > this.a) {
            hl.z3(m84Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {m84Var.getText()};
        tL_textWithEntities.entities = ls6.d0(q84Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        q84Var.a(r47Var, tL_textWithEntities, this.b);
        idVar.dismiss();
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public tu1(q84 q84Var, m84 m84Var, int i, r47 r47Var, boolean z) {
        this.c = q84Var;
        this.d = m84Var;
        this.a = i;
        this.e = r47Var;
        this.b = z;
    }

    @Override
    public final void onError(Throwable th) {
    }
}
