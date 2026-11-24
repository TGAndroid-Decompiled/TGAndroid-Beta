package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class or9 extends ka {
    public final SaveToGallerySettingsActivity d;

    public or9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 1 || i == 2 || i == 4 || i == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.s.size();
    }

    @Override
    public final int d(int i) {
        return ((pr9) this.d.s.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        String str;
        View view = u69Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        boolean z = false;
        if (((pr9) arrayList.get(i)).a == 1) {
            xib xibVar = (xib) view;
            if (saveToGallerySettingsActivity.w.size() > 0) {
                z = true;
            }
            xibVar.setNeedDivider(z);
        } else if (((pr9) arrayList.get(i)).a == 6) {
            bjb bjbVar = (bjb) view;
            sr9 c0 = saveToGallerySettingsActivity.c0();
            if (i == saveToGallerySettingsActivity.e) {
                bjbVar.f(jb6.M0(2131745654, null), c0.a, true);
                int i2 = cmb.bk;
                bjbVar.c(saveToGallerySettingsActivity.getThemedColor(i2), 2131232144);
                saveToGallerySettingsActivity.b0(bjbVar, i2);
                return;
            }
            bjbVar.f(jb6.M0(2131745647, null), c0.b, false);
            int i3 = cmb.Yj;
            bjbVar.c(saveToGallerySettingsActivity.getThemedColor(i3), 2131232147);
            saveToGallerySettingsActivity.b0(bjbVar, i3);
        } else if (((pr9) arrayList.get(i)).a == 7) {
            njb njbVar = (njb) view;
            if (i == saveToGallerySettingsActivity.h) {
                long j = saveToGallerySettingsActivity.c0().c;
                if (saveToGallerySettingsActivity.c != null) {
                    njbVar.setText(jb6.a0("SaveToGalleryVideoHintCurrent", null, 2131745650, new Object[0]));
                    return;
                }
                int i4 = saveToGallerySettingsActivity.a;
                if (i4 == 1) {
                    njbVar.setText(jb6.a0("SaveToGalleryVideoHintUser", null, 2131745648, new Object[0]));
                    return;
                } else if (i4 == 4) {
                    njbVar.setText(jb6.a0("SaveToGalleryVideoHintChannels", null, 2131745651, new Object[0]));
                    return;
                } else if (i4 == 2) {
                    njbVar.setText(jb6.a0("SaveToGalleryVideoHintGroup", null, 2131745649, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            njbVar.setText(((pr9) arrayList.get(i)).d);
        } else if (((pr9) arrayList.get(i)).a == 5) {
            ((jf5) view).setText(((pr9) arrayList.get(i)).d);
        } else if (((pr9) arrayList.get(i)).a == 2) {
            w8c w8cVar = (w8c) view;
            rr9 rr9Var = ((pr9) arrayList.get(i)).c;
            TLObject a2 = saveToGallerySettingsActivity.getMessagesController().a2(rr9Var.d);
            if (a2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) a2;
                if (user.self) {
                    str = jb6.M0(2131745635, null);
                } else {
                    str = bw2.m(0, user.first_name, user.last_name);
                }
            } else if (a2 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) a2).title;
            } else {
                str = null;
            }
            w8cVar.setSelfAsSavedMessages(true);
            StringBuilder sb = new StringBuilder();
            if (rr9Var.a()) {
                if (rr9Var.a) {
                    sb.append(jb6.M0(2131745654, null));
                }
                if (rr9Var.b) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    long j2 = rr9Var.c;
                    if (j2 > 0 && j2 < 4194304000L) {
                        sb.append(jb6.a0("SaveToGalleryVideosUpTo", null, 2131745646, gm.i0(j2, true, false)));
                    } else {
                        sb.append(jb6.a0("SaveToGalleryVideos", null, 2131745647, new Object[0]));
                    }
                }
            } else {
                sb.append(jb6.M0(2131745655, null));
            }
            if (i == arrayList.size() - 1 || ((pr9) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            w8cVar.d(a2, str, sb, z);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout;
        float f;
        TLObject L0;
        v8c v8cVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i) {
            case 1:
                xib xibVar = new xib(viewGroup.getContext());
                xibVar.o(2131232105, jb6.M0(2131747656, null), true);
                xibVar.g(cmb.u6, cmb.t6);
                anb.h(cmb.c6, null, xibVar);
                view = xibVar;
                break;
            case 2:
                View w8cVar = new w8c(4, 0, null, viewGroup.getContext(), false, false);
                anb.h(cmb.c6, null, w8cVar);
                linearLayout = w8cVar;
                view = linearLayout;
                break;
            case 3:
                v8cVar = new bba(viewGroup.getContext(), (hg9) null);
                view = v8cVar;
                break;
            case 4:
                xib xibVar2 = new xib(viewGroup.getContext());
                xibVar2.k(jb6.M0(2131747648, null), false);
                xibVar2.g(-1, cmb.o7);
                anb.h(cmb.c6, null, xibVar2);
                v8cVar = xibVar2;
                view = v8cVar;
                break;
            case 5:
                View jf5Var = new jf5(viewGroup.getContext());
                anb.h(cmb.c6, null, jf5Var);
                v8cVar = jf5Var;
                view = v8cVar;
                break;
            case 6:
                View bjbVar = new bjb(viewGroup.getContext());
                anb.h(cmb.c6, null, bjbVar);
                v8cVar = bjbVar;
                view = v8cVar;
                break;
            case 7:
                view = new njb(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                dx9 dx9Var = new dx9(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                qr9 qr9Var = new qr9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                qr9Var.setTextSize(gm.L(13.0f));
                qr9Var.setText(gm.i0(524288L, true, false));
                frameLayout.addView(qr9Var, qoe.e(-2, -2, 83));
                qr9 qr9Var2 = new qr9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                qr9Var2.setTextSize(gm.L(13.0f));
                frameLayout.addView(qr9Var2, qoe.e(-2, -2, 81));
                qr9 qr9Var3 = new qr9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                qr9Var3.setTextSize(gm.L(13.0f));
                qr9Var3.setText(gm.i0(4194304000L, true, false));
                frameLayout.addView(qr9Var3, qoe.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, qoe.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(dx9Var, qoe.t(-1, 38, 0, 5, 0, 5, 4));
                long j = saveToGallerySettingsActivity.c0().c;
                if (j < 0 || j > 4194304000L) {
                    j = 4194304000L;
                }
                dx9Var.setReportChanges(true);
                dx9Var.setDelegate(new sm2(this, dx9Var, qr9Var, qr9Var2, qr9Var3));
                if (((float) j) > 7.340032E7f) {
                    f = b10.A((float) (j - 104857600), 4.0894464E9f, 0.3f, 0.7f);
                } else {
                    f = (((float) (j - 524288)) / 1.0433331E8f) * 0.7f;
                }
                dx9Var.setProgress(f);
                dx9Var.y.n(false, dx9Var.getProgress());
                anb.h(cmb.c6, null, linearLayout2);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                v8c v8cVar2 = new v8c(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (pg3.D(saveToGallerySettingsActivity.b)) {
                    L0 = oc7.r1(SaveToGallerySettingsActivity.Z(saveToGallerySettingsActivity)).W1(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    L0 = oc7.r1(SaveToGallerySettingsActivity.a0(saveToGallerySettingsActivity)).L0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                v8cVar2.a(null, L0);
                anb.h(cmb.c6, saveToGallerySettingsActivity.getResourceProvider(), v8cVar2);
                v8cVar = v8cVar2;
                view = v8cVar;
                break;
            case 10:
                v8cVar = new bba(viewGroup.getContext(), (hg9) null);
                view = v8cVar;
                break;
        }
        return kt6.h(view, view, -1, -2);
    }
}
