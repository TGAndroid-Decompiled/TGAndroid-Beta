package defpackage;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class dm8 implements p8c {
    public final byte a;
    public final ProfileActivity b;

    public dm8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.Z6;
                if (view instanceof ghb) {
                    ghb ghbVar = (ghb) view;
                    ghbVar.a.setLoading(profileActivity.o5);
                    ghbVar.b.setLoading(profileActivity.o5);
                    return;
                }
                return;
            case 1:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.v2((Boolean) obj);
                return;
            case 2:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new qx3(profileActivity, profileActivity.getParentActivity(), profileActivity.A0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                RectF rectF4 = ProfileActivity.Z6;
                if (view2 instanceof ld5) {
                    ((ld5) view2).setTextColor(bkb.v0(bkb.K6, profileActivity.A0));
                } else if (view2 instanceof ghb) {
                    ((ghb) view2).updateColors();
                } else if (view2 instanceof wgb) {
                    ((wgb) view2).updateColors();
                } else if (view2 instanceof s1) {
                    ((s1) view2).updateColors();
                } else if (view2 instanceof vl7) {
                    ((vl7) view2).getCheckBox().invalidate();
                } else if (view2 instanceof br8) {
                    br8 br8Var = (br8) view2;
                    ii2 ii2Var = br8Var.r;
                    int L = gl.L(8.0f);
                    int i = bkb.n6;
                    wjb wjbVar = br8Var.a;
                    int p1 = bkb.p1(0.1f, bkb.v0(i, wjbVar));
                    int p12 = bkb.p1(0.22f, bkb.v0(i, wjbVar));
                    ii2Var.setBackground(bkb.i0(L, L, L, L, p1, p12, p12));
                    ii2Var.setTextColor(bkb.v0(i, wjbVar));
                } else if (view2 instanceof ip8) {
                    ((ip8) view2).updateColors();
                }
                ko8 ko8Var = profileActivity.d;
                profileActivity.a.getClass();
                ko8Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
