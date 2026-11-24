package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;
public final class nrc implements c39 {
    public final byte a;
    public final Object b;

    public nrc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void d(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                orc orcVar = (orc) obj;
                String M0 = k96.M0(2131753735, null);
                StringBuilder k = b00.k(M0, " ");
                String[] strArr = WallpapersListActivity.k0;
                k.append(k96.M0(WallpapersListActivity.l0[i], strArr[i]));
                SpannableString spannableString = new SpannableString(k.toString());
                spannableString.setSpan(new ForegroundColorSpan(bkb.w0(null, bkb.A8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = orcVar.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.P("", true);
                orcVar.n = strArr[i];
                orcVar.E("", true);
                return;
            default:
                af4 af4Var = (af4) obj;
                if (view instanceof iba) {
                    af4Var.e(i, view, ((iba) view).getMessage(), 0);
                    return;
                } else if (view instanceof lba) {
                    af4Var.e(i, view, ((lba) view).getMessage(), 0);
                    return;
                } else if (view instanceof eba) {
                    af4Var.e(i, view, ((eba) view).getMessage(), 0);
                    return;
                } else if (view instanceof bw2) {
                    af4Var.e(i, view, ((bw2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof ue3) {
                    af4Var.e(i, view, ((ue3) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
        }
    }
}
