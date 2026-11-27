package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;
public final class bwc implements r69 {
    public final byte a;
    public final Object b;

    public bwc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void e(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cwc cwcVar = (cwc) obj;
                String M0 = ob6.M0(2131753731, null);
                StringBuilder l = c00.l(M0, " ");
                String[] strArr = WallpapersListActivity.k0;
                l.append(ob6.M0(WallpapersListActivity.l0[i], strArr[i]));
                SpannableString spannableString = new SpannableString(l.toString());
                spannableString.setSpan(new ForegroundColorSpan(aob.w0(null, aob.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = cwcVar.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.P("", true);
                cwcVar.n = strArr[i];
                cwcVar.E("", true);
                return;
            default:
                yg4 yg4Var = (yg4) obj;
                if (view instanceof zea) {
                    yg4Var.e(i, view, ((zea) view).getMessage(), 0);
                    return;
                } else if (view instanceof cfa) {
                    yg4Var.e(i, view, ((cfa) view).getMessage(), 0);
                    return;
                } else if (view instanceof vea) {
                    yg4Var.e(i, view, ((vea) view).getMessage(), 0);
                    return;
                } else if (view instanceof vw2) {
                    yg4Var.e(i, view, ((vw2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof of3) {
                    yg4Var.e(i, view, ((of3) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
        }
    }
}
