package defpackage;

import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.web.HttpGetFileTask;
public final class w0 implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;

    public w0(int i, r47 r47Var) {
        this.a = (byte) 16;
        this.b = i;
        this.c = r47Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        int i;
        v21 j;
        byte b = this.a;
        int i2 = 1;
        int i3 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((pcc) obj).a(Integer.valueOf(i3));
                return;
            case 1:
                ((m) obj).a(Integer.valueOf(i3));
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj;
                boolean z3 = !zArr[i3];
                zArr[i3] = z3;
                ((sg2) view).c(z3, true);
                return;
            case 3:
                ((zu1) obj).m8(i3);
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.U2.getActionBarMenuOnItemClick().b(i3);
                chatAttachAlertPhotoLayout.x.U(null, null);
                return;
            case 5:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i3);
                return;
            case 6:
                g34 g34Var = (g34) obj;
                if (g34Var.n != null && i3 != g34Var.s) {
                    b8c b8cVar = g34Var.r;
                    if (b8cVar != null) {
                        b8cVar.A = i3;
                    }
                    g34Var.b(i3, true);
                    g34Var.n.a(Integer.valueOf(i3));
                    return;
                }
                return;
            case 7:
                ((o94) obj).c.a(Integer.valueOf(i3));
                return;
            case 8:
                ((h85) obj).l1.x(i3, true);
                return;
            case 9:
                h85 h85Var = (h85) ((gb5) obj).d;
                h85Var.F0(i3);
                h85Var.dismiss();
                return;
            case 10:
                fj6 fj6Var = (fj6) obj;
                if (!fj6Var.c.s()) {
                    hic hicVar = fj6Var.c;
                    if (!hicVar.I) {
                        if (hicVar.getCurrentPosition() == i3) {
                            e b0 = fj6Var.b0();
                            if (b0 instanceof ej6) {
                                ((ej6) b0).v();
                                return;
                            }
                            return;
                        }
                        fj6Var.t0(i3, true);
                        fj6Var.c.F(i3);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((em6) obj).S.f1(i3 + 8);
                return;
            case 12:
                oab oabVar = (oab) obj;
                boolean contains = oabVar.e.contains(Integer.valueOf(i3));
                ArrayList arrayList = oabVar.e;
                if (contains) {
                    if (arrayList.size() > 1) {
                        oabVar.e.remove(Integer.valueOf(i3));
                    } else {
                        return;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i3));
                }
                hl.d0(oabVar.b, new ji7(oabVar, (byte) 1));
                return;
            case 13:
                yu7 yu7Var = (yu7) obj;
                if (yu7Var.e.getAdapter() instanceof i14) {
                    o24 o24Var = ((i14) yu7Var.e.getAdapter()).c;
                    if ((i3 == 1 || i3 == 2) && o24Var.x1) {
                        if (i3 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        o24Var.O(true, false, z);
                        return;
                    } else if (i3 == 0 && o24Var.w1) {
                        o24Var.O(true, true, false);
                        return;
                    }
                }
                yu7Var.e.x(i3, false);
                return;
            case 14:
                w78 w78Var = (w78) obj;
                n8 n8Var = w78Var.J;
                if (n8Var != null && n8Var.isShowing()) {
                    w78Var.J.d(true);
                }
                if (i3 == 0) {
                    jj.I(w78Var.getParentActivity(), w78Var.G.a(), new s78(w78Var, (byte) 2));
                    return;
                }
                w78Var.Z(w78Var.b, w78Var.c, true, 0);
                w78Var.finishFragment();
                return;
            case 15:
                l98 l98Var = (l98) obj;
                n8 n8Var2 = l98Var.n0;
                if (n8Var2 != null && n8Var2.isShowing()) {
                    l98Var.n0.d(true);
                }
                if (i3 == 0) {
                    jj.I(l98Var.getParentActivity(), l98Var.V.a(), new d98(l98Var, (byte) 2));
                    return;
                } else {
                    l98Var.i0(0, true);
                    return;
                }
            case 16:
                r47 r47Var = (r47) obj;
                int i4 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    hl.c3(new r77(r7a.B(i3), r47.B0(r47Var.k), r47Var.e1(), keyboardButtonProto.getData(), (byte) 17));
                    return;
                }
                return;
            case 17:
                ((zn8) obj).b.x(i3, true);
                return;
            case 18:
                gkc gkcVar = (gkc) obj;
                if (gkcVar.V == null && view.getAlpha() != 0.0f) {
                    gkcVar.c(i3, true);
                    return;
                }
                return;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                if (i3 == 0) {
                    gr8 gr8Var = profileActivity.O;
                    if (!gr8Var.F1) {
                        if (eja.t0(gr8Var.getClosestTab())) {
                            gr8 gr8Var2 = profileActivity.O;
                            profileActivity.O.U0(gr8Var2.s1(gr8Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            return;
                        } else if (!profileActivity.getMessagesController().k5()) {
                            profileActivity.showDialog(new xk8((e) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().Y3.edit().putBoolean("story_keep", true).apply();
                            sbb C = sbb.C(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            C.y = new fr8(profileActivity);
                            C.Q(null);
                            return;
                        }
                    }
                }
                if (eja.t0(profileActivity.O.getClosestTab())) {
                    long a = profileActivity.a();
                    gr8 gr8Var3 = profileActivity.O;
                    int s1 = gr8Var3.s1(gr8Var3.getClosestTab());
                    String v = profileActivity.getMessagesController().O1().v(s1, a);
                    j61 j61Var = profileActivity.D5;
                    if (j61Var != null) {
                        j61Var.run();
                        profileActivity.D5 = null;
                    }
                    v21.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<r47> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i5 = 0; i5 < actionModeSelected.size(); i5++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i5).l;
                            if (storyItem != null) {
                                arrayList2.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.E(false);
                    if (!arrayList2.isEmpty()) {
                        r77 r77Var = new r77(profileActivity, a, s1, arrayList2, (byte) 16);
                        profileActivity.getMessagesController().O1().e0(s1, a, arrayList2);
                        d31.b0(profileActivity).K(2131623980, hl.S2(ob6.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", v)), ob6.M0(2131743540, null), r77Var).j();
                        return;
                    }
                    return;
                }
                long e = profileActivity.getUserConfig().e();
                j61 j61Var2 = profileActivity.D5;
                if (j61Var2 != null) {
                    j61Var2.run();
                    profileActivity.D5 = null;
                }
                v21.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ArrayList arrayList3 = new ArrayList();
                SparseArray<r47> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i = 0;
                    for (int i6 = 0; i6 < actionModeSelected2.size(); i6++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i6).l;
                        if (storyItem2 != null) {
                            arrayList3.add(storyItem2);
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                profileActivity.O.E(false);
                if (z2) {
                    profileActivity.O.f1(8);
                }
                if (!arrayList3.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList3.size()];
                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList3.get(i7);
                        zArr2[i7] = storyItem3.pinned;
                        storyItem3.pinned = z2;
                    }
                    profileActivity.getMessagesController().O1().q0(e, arrayList3, false);
                    boolean[] zArr3 = {false};
                    boolean z5 = z2;
                    profileActivity.D5 = new j61(profileActivity, e, arrayList3, z2, (byte) 9);
                    da7 da7Var = new da7(profileActivity, zArr3, arrayList3, zArr2, e, (byte) 13);
                    if (z5) {
                        j = d31.b0(profileActivity).L(2131623990, ob6.G(i, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743540, null), da7Var).j();
                    } else {
                        j = d31.b0(profileActivity).J(2131623980, ob6.G(i, "StoryArchived", new Object[0]), ob6.M0(2131743540, null), 5000, false, da7Var).j();
                    }
                    j.w = new ep8(profileActivity, zArr3, (byte) 8);
                    return;
                }
                return;
            case 20:
                pz8 pz8Var = ((cz8) obj).h;
                u55 u55Var = pz8Var.d;
                ArrayList arrayList4 = pz8Var.n;
                if (i3 >= 0 && i3 < arrayList4.size()) {
                    pz8Var.w = true;
                    pz8Var.h.a(i3, true);
                    int i8 = ((az8) arrayList4.get(i3)).d;
                    int K0 = u55Var.K0();
                    if ((u55Var.m(i8) == null && Math.abs(i8 - K0) > pz8Var.r * 9) || !xea.c()) {
                        pz8Var.c.E0();
                        hw6 hw6Var = pz8Var.f;
                        if (K0 < i8) {
                            i2 = 0;
                        }
                        hw6Var.b = i2;
                        hw6Var.k(i8, 0, false, false);
                        return;
                    }
                    y46 y46Var = new y46(pz8Var.getContext());
                    y46Var.a = ((az8) arrayList4.get(i3)).d;
                    u55Var.v0(y46Var);
                    return;
                }
                return;
            case 21:
                xi xiVar = (xi) obj;
                EditTextBoldCursor editTextBoldCursor = xiVar.m1;
                hl.t1(editTextBoldCursor);
                xiVar.n1.a(Integer.valueOf(i3), editTextBoldCursor.getText().toString());
                xiVar.dismiss();
                return;
            case 22:
                ((yg9) obj).Q.Z3(i3);
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i9 = ScrollSlidingTextTabStrip.p0;
                scrollSlidingTextTabStrip.g(view, i3, scrollSlidingTextTabStrip.a.indexOfChild(view));
                return;
            case 24:
                fra fraVar = ((gra) obj).e2;
                int i10 = fra.w;
                fraVar.a(i3);
                return;
            case 25:
                ((fra) obj).a(i3);
                return;
            case 26:
                w1b w1bVar = (w1b) obj;
                w1bVar.i0.F(i3);
                w1bVar.o0(i3, true);
                return;
            case 27:
                kac kacVar = (kac) obj;
                int i11 = kacVar.b.i.q;
                if (i11 == 2) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    ph0.e().b(false);
                    kacVar.updateAppUpdateViews(i3, true);
                    return;
                } else if (i11 == 3) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    ph0 e2 = ph0.e();
                    if (e2.j) {
                        HttpGetFileTask httpGetFileTask = e2.l;
                        if (httpGetFileTask != null) {
                            httpGetFileTask.cancel(false);
                        }
                        e2.j = false;
                        jn7.e().k(297, new Object[0]);
                    }
                    kacVar.updateAppUpdateViews(i3, true);
                    return;
                } else {
                    File g = a.a.g();
                    if (g != null) {
                        hl.s2(g, "Telegram.apk", "application/vnd.android.package-archive", kacVar.d, null, false);
                        return;
                    }
                    return;
                }
            default:
                zuc zucVar = (zuc) obj;
                EditText editText = zucVar.a;
                TextView[] textViewArr = zucVar.O;
                TextView textView = textViewArr[i3];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i3].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    zucVar.a();
                    zucVar.a();
                    Runnable runnable = zucVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public w0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
