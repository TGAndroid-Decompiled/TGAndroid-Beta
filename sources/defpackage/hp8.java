package defpackage;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class hp8 implements pcc {
    public final byte a;
    public final ProfileActivity b;

    public hp8(ProfileActivity profileActivity, byte b) {
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
                if (view instanceof clb) {
                    clb clbVar = (clb) view;
                    clbVar.a.setLoading(profileActivity.o5);
                    clbVar.b.setLoading(profileActivity.o5);
                    return;
                }
                return;
            case 1:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.w2((Boolean) obj);
                return;
            case 2:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.Z6;
                if (view2 instanceof mf5) {
                    ((mf5) view2).setTextColor(aob.v0(aob.L6, profileActivity.A0));
                } else if (view2 instanceof clb) {
                    ((clb) view2).updateColors();
                } else if (view2 instanceof skb) {
                    ((skb) view2).updateColors();
                } else if (view2 instanceof t1) {
                    ((t1) view2).updateColors();
                } else if (view2 instanceof uo7) {
                    ((uo7) view2).getCheckBox().invalidate();
                } else if (view2 instanceof lu8) {
                    lu8 lu8Var = (lu8) view2;
                    ej2 ej2Var = lu8Var.r;
                    int L = hl.L(8.0f);
                    int i = aob.o6;
                    vnb vnbVar = lu8Var.a;
                    int p1 = aob.p1(0.1f, aob.v0(i, vnbVar));
                    int p12 = aob.p1(0.22f, aob.v0(i, vnbVar));
                    ej2Var.setBackground(aob.i0(L, L, L, L, p1, p12, p12));
                    ej2Var.setTextColor(aob.v0(i, vnbVar));
                } else if (view2 instanceof us8) {
                    ((us8) view2).updateColors();
                }
                wr8 wr8Var = profileActivity.d;
                profileActivity.a.getClass();
                wr8Var.d(RecyclerView.S(view2));
                profileActivity.d.getClass();
                return;
            default:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new ly3(profileActivity, profileActivity.getParentActivity(), profileActivity.A0, arrayList));
                return;
        }
    }
}
