package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class ft9 extends la {
    public final SaveToGallerySettingsActivity d;

    public ft9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        return ((gt9) this.d.s.get(i)).a;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String str;
        View view = f89Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        boolean z = false;
        if (((gt9) arrayList.get(i)).a == 1) {
            skb skbVar = (skb) view;
            if (saveToGallerySettingsActivity.w.size() > 0) {
                z = true;
            }
            skbVar.setNeedDivider(z);
        } else if (((gt9) arrayList.get(i)).a == 6) {
            wkb wkbVar = (wkb) view;
            jt9 b0 = saveToGallerySettingsActivity.b0();
            if (i == saveToGallerySettingsActivity.e) {
                wkbVar.f(ob6.M0(2131745648, null), b0.a, true);
                int i2 = aob.ck;
                wkbVar.c(saveToGallerySettingsActivity.getThemedColor(i2), 2131232143);
                saveToGallerySettingsActivity.a0(wkbVar, i2);
                return;
            }
            wkbVar.f(ob6.M0(2131745641, null), b0.b, false);
            int i3 = aob.Zj;
            wkbVar.c(saveToGallerySettingsActivity.getThemedColor(i3), 2131232146);
            saveToGallerySettingsActivity.a0(wkbVar, i3);
        } else if (((gt9) arrayList.get(i)).a == 7) {
            ilb ilbVar = (ilb) view;
            if (i == saveToGallerySettingsActivity.h) {
                long j = saveToGallerySettingsActivity.b0().c;
                if (saveToGallerySettingsActivity.c != null) {
                    ilbVar.setText(ob6.a0("SaveToGalleryVideoHintCurrent", null, 2131745644, new Object[0]));
                    return;
                }
                int i4 = saveToGallerySettingsActivity.a;
                if (i4 == 1) {
                    ilbVar.setText(ob6.a0("SaveToGalleryVideoHintUser", null, 2131745642, new Object[0]));
                    return;
                } else if (i4 == 4) {
                    ilbVar.setText(ob6.a0("SaveToGalleryVideoHintChannels", null, 2131745645, new Object[0]));
                    return;
                } else if (i4 == 2) {
                    ilbVar.setText(ob6.a0("SaveToGalleryVideoHintGroup", null, 2131745643, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            ilbVar.setText(((gt9) arrayList.get(i)).d);
        } else if (((gt9) arrayList.get(i)).a == 5) {
            ((mf5) view).setText(((gt9) arrayList.get(i)).d);
        } else if (((gt9) arrayList.get(i)).a == 2) {
            vac vacVar = (vac) view;
            it9 it9Var = ((gt9) arrayList.get(i)).c;
            TLObject b2 = saveToGallerySettingsActivity.getMessagesController().b2(it9Var.d);
            if (b2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) b2;
                if (user.self) {
                    str = ob6.M0(2131745629, null);
                } else {
                    str = lv2.m(0, user.first_name, user.last_name);
                }
            } else if (b2 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) b2).title;
            } else {
                str = null;
            }
            vacVar.setSelfAsSavedMessages(true);
            StringBuilder sb = new StringBuilder();
            if (it9Var.a()) {
                if (it9Var.a) {
                    sb.append(ob6.M0(2131745648, null));
                }
                if (it9Var.b) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    long j2 = it9Var.c;
                    if (j2 > 0 && j2 < 4194304000L) {
                        sb.append(ob6.a0("SaveToGalleryVideosUpTo", null, 2131745640, hl.i0(j2, true, false)));
                    } else {
                        sb.append(ob6.a0("SaveToGalleryVideos", null, 2131745641, new Object[0]));
                    }
                }
            } else {
                sb.append(ob6.M0(2131745649, null));
            }
            if (i == arrayList.size() - 1 || ((gt9) arrayList.get(i + 1)).a == 2) {
                z = true;
            }
            vacVar.d(b2, str, sb, z);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout;
        float f;
        int i2;
        TLObject M0;
        int i3;
        uac uacVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i) {
            case 1:
                skb skbVar = new skb(viewGroup.getContext());
                skbVar.o(2131232104, ob6.M0(2131747650, null), true);
                skbVar.g(aob.v6, aob.u6);
                yob.h(aob.d6, null, skbVar);
                view = skbVar;
                break;
            case 2:
                View vacVar = new vac(4, 0, null, viewGroup.getContext(), false, false);
                yob.h(aob.d6, null, vacVar);
                linearLayout = vacVar;
                view = linearLayout;
                break;
            case 3:
                uacVar = new sca(viewGroup.getContext(), (uh9) null);
                view = uacVar;
                break;
            case 4:
                skb skbVar2 = new skb(viewGroup.getContext());
                skbVar2.k(ob6.M0(2131747642, null), false);
                skbVar2.g(-1, aob.p7);
                yob.h(aob.d6, null, skbVar2);
                uacVar = skbVar2;
                view = uacVar;
                break;
            case 5:
                View mf5Var = new mf5(viewGroup.getContext());
                yob.h(aob.d6, null, mf5Var);
                uacVar = mf5Var;
                view = uacVar;
                break;
            case 6:
                View wkbVar = new wkb(viewGroup.getContext());
                yob.h(aob.d6, null, wkbVar);
                uacVar = wkbVar;
                view = uacVar;
                break;
            case 7:
                view = new ilb(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                uy9 uy9Var = new uy9(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                ht9 ht9Var = new ht9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ht9Var.setTextSize(hl.L(13.0f));
                ht9Var.setText(hl.i0(524288L, true, false));
                frameLayout.addView(ht9Var, tre.e(-2, -2, 83));
                ht9 ht9Var2 = new ht9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ht9Var2.setTextSize(hl.L(13.0f));
                frameLayout.addView(ht9Var2, tre.e(-2, -2, 81));
                ht9 ht9Var3 = new ht9(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                ht9Var3.setTextSize(hl.L(13.0f));
                ht9Var3.setText(hl.i0(4194304000L, true, false));
                frameLayout.addView(ht9Var3, tre.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, tre.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(uy9Var, tre.t(-1, 38, 0, 5, 0, 5, 4));
                long j = saveToGallerySettingsActivity.b0().c;
                if (j < 0 || j > 4194304000L) {
                    j = 4194304000L;
                }
                uy9Var.setReportChanges(true);
                uy9Var.setDelegate(new am2(this, uy9Var, ht9Var, ht9Var2, ht9Var3));
                if (((float) j) > 7.340032E7f) {
                    f = c00.B((float) (j - 104857600), 4.0894464E9f, 0.3f, 0.7f);
                } else {
                    f = (((float) (j - 524288)) / 1.0433331E8f) * 0.7f;
                }
                uy9Var.setProgress(f);
                uy9Var.y.o(false, uy9Var.getProgress());
                yob.h(aob.d6, null, linearLayout2);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                uac uacVar2 = new uac(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (wf3.D(saveToGallerySettingsActivity.b)) {
                    i3 = ((e) saveToGallerySettingsActivity).currentAccount;
                    M0 = uc7.s1(i3).X1(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i2 = ((e) saveToGallerySettingsActivity).currentAccount;
                    M0 = uc7.s1(i2).M0(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                uacVar2.a(null, M0);
                yob.h(aob.d6, saveToGallerySettingsActivity.getResourceProvider(), uacVar2);
                uacVar = uacVar2;
                view = uacVar;
                break;
            case 10:
                uacVar = new sca(viewGroup.getContext(), (uh9) null);
                view = uacVar;
                break;
        }
        return qu6.h(view, view, -1, -2);
    }
}
