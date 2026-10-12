package ci;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.wy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.db1;
import org.telegram.ui.di1;
import org.telegram.ui.dq0;
import org.telegram.ui.dr0;
import org.telegram.ui.du0;
import org.telegram.ui.eo;
import org.telegram.ui.fh0;
import org.telegram.ui.gh0;
import org.telegram.ui.h50;
import org.telegram.ui.l01;
import org.telegram.ui.m01;
import org.telegram.ui.mq0;
import org.telegram.ui.om0;
import org.telegram.ui.p80;
import org.telegram.ui.pn0;
import org.telegram.ui.qi1;
import org.telegram.ui.qq0;
import org.telegram.ui.r80;
public final class m4 implements View.OnClickListener {
    public final int f5591a;
    public final int f5592b;
    public final Object f5593c;

    public m4(Object obj, int i10, int i11) {
        this.f5591a = i11;
        this.f5593c = obj;
        this.f5592b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.sc j3;
        int i11 = this.f5591a;
        int i12 = this.f5592b;
        Object obj = this.f5593c;
        switch (i11) {
            case 0:
                cb cbVar = (cb) obj;
                if (cbVar.f5942e.contains(Integer.valueOf(i12))) {
                    if (cbVar.f5942e.size() > 1) {
                        cbVar.f5942e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    cbVar.f5942e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) cbVar.f5940b, (Utilities.Callback<View>) new ai.y1(cbVar, 10));
                return;
            case 1:
                u6 u6Var = ((s6) obj).f5954b;
                if (u6Var.f6073r && (callback = u6Var.f6071f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.e2) obj).P.Z3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f14175b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                jh.a aVar = ((jh.h) obj).h;
                if (aVar != null) {
                    aVar.h(i12);
                    return;
                }
                return;
            case 5:
                ((eo) obj).L9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f26204f0 = !g0Var.f26204f0;
                        }
                    } else {
                        g0Var.f26203e0 = !g0Var.f26203e0;
                    }
                } else {
                    g0Var.f26202d0 = !g0Var.f26202d0;
                }
                g0Var.X.N(true);
                g0Var.u();
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f23799q1;
                chatAttachAlertPhotoLayout.f30570b.f24321a1.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f23843w.M(null, null);
                return;
            case 9:
                ((h50) obj).f25885b.x(i12, true);
                return;
            case 10:
                h50 h50Var = ((e40) obj).f25593c;
                h50Var.p(i12);
                h50Var.dismiss();
                return;
            case 11:
                ie0 ie0Var = (ie0) obj;
                if (ie0Var.f27136e.getAdapter() instanceof ge0) {
                    d00 d00Var = ((wy) ((ge0) ie0Var.f27136e.getAdapter())).f32578c;
                    if ((i12 == 1 || i12 == 2) && d00Var.f25136w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d00Var.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && d00Var.f25132v1) {
                        d00Var.P(true, true, false);
                        return;
                    }
                }
                ie0Var.f27136e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.f26148c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f24082a.indexOfChild(view));
                return;
            case 14:
                v71 v71Var = (v71) obj;
                int i13 = v71Var.f31451b.f24044i.f33024q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    v71Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    v71Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", v71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.y0) obj).f32104b.x(i12, true);
                return;
            case 16:
                qi1 qi1Var = (qi1) obj;
                if (qi1Var.U == null && view.getAlpha() != 0.0f) {
                    qi1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                r80 r80Var = (r80) obj;
                r80Var.Q.dismiss();
                int i14 = r80Var.f41529c0;
                if (i14 >= 0) {
                    r80Var.f41530d0.setKeepMedia(i14, i12);
                    p80 p80Var = r80Var.f41531e0;
                    if (p80Var != null) {
                        p80Var.a(i12);
                        return;
                    }
                    return;
                }
                p80 p80Var2 = r80Var.f41531e0;
                if (p80Var2 != null) {
                    p80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                gh0 gh0Var = (gh0) obj;
                ValueAnimator valueAnimator = gh0Var.f37121c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    di1 di1Var = gh0Var.f37121c;
                    if (!di1Var.H) {
                        if (di1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.m2 X = gh0Var.X();
                            if (X instanceof fh0) {
                                ((fh0) X).s();
                                return;
                            }
                            return;
                        }
                        gh0Var.m0(i12, true);
                        gh0Var.f37121c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                pn0 pn0Var = (pn0) obj;
                om0 om0Var = pn0Var.D1;
                pn0Var.S0 = i12;
                if (i12 == 1) {
                    pn0Var.f41022i0 = pn0Var.f41018g0;
                } else if (i12 == 4) {
                    pn0Var.f41022i0 = pn0Var.f41020h0;
                } else if (i12 == 2) {
                    pn0Var.f41022i0 = pn0Var.f41013e0;
                } else if (i12 == 3) {
                    pn0Var.f41022i0 = pn0Var.f41016f0;
                } else {
                    pn0Var.f41022i0 = pn0Var.f41010d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, pn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pn0Var.f41025j1);
                    PhotoViewer.t1().c2(arrayList, 0, om0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(pn0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, om0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(pn0Var.f41029m1);
                    PhotoViewer.t1().c2(arrayList3, 0, om0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = pn0Var.f41023i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), om0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = pn0Var.f41027k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), om0Var);
                    return;
                }
            case 21:
                mq0 mq0Var = (mq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = mq0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    mq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(mq0Var.getParentActivity(), mq0Var.F.a(), new dq0(mq0Var, 2));
                    return;
                }
                mq0Var.V(mq0Var.f40111b, mq0Var.f40112c, true, 0);
                mq0Var.finishFragment();
                return;
            case 22:
                dr0 dr0Var = (dr0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = dr0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    dr0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(dr0Var.getParentActivity(), dr0Var.U.a(), new qq0(dr0Var, 1));
                    return;
                } else {
                    dr0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f33951b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    m01 m01Var = profileActivity.O;
                    if (!m01Var.C1) {
                        if (hw0.w0(m01Var.getClosestTab())) {
                            m01 m01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), m01Var2.h1(m01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            lc D = lc.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f5531x = new l01(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (hw0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    m01 m01Var3 = profileActivity.O;
                    int h12 = m01Var3.h1(m01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.r8 r8Var = profileActivity.f34218x5;
                    if (r8Var != null) {
                        r8Var.run();
                        profileActivity.f34218x5 = null;
                    }
                    org.telegram.ui.Components.sc.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i16 = 0; i16 < actionModeSelected.size(); i16++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i16).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.L(false);
                    if (!arrayList6.isEmpty()) {
                        org.telegram.messenger.k7 k7Var = new org.telegram.messenger.k7(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        org.telegram.ui.Components.zc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), k7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.r8 r8Var2 = profileActivity.f34218x5;
                if (r8Var2 != null) {
                    r8Var2.run();
                    profileActivity.f34218x5 = null;
                }
                org.telegram.ui.Components.sc.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i10 = 0;
                    for (int i17 = 0; i17 < actionModeSelected2.size(); i17++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i17).storyItem;
                        if (storyItem2 != null) {
                            arrayList7.add(storyItem2);
                            i10++;
                        }
                    }
                } else {
                    i10 = 0;
                }
                profileActivity.O.L(false);
                if (z11) {
                    profileActivity.O.Y0(8);
                }
                if (!arrayList7.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList7.size()];
                    for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList7.get(i18);
                        zArr2[i18] = storyItem3.pinned;
                        storyItem3.pinned = z11;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList7, false);
                    boolean[] zArr3 = {false};
                    boolean z14 = z11;
                    profileActivity.f34218x5 = new org.telegram.messenger.r8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.zc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.zc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new du0(18, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                db1 db1Var = (db1) obj;
                db1Var.f36737i0.D(i12);
                db1Var.m0(i12, true);
                return;
            case 26:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) obj;
                EditText editText = j9Var.f34937a;
                TextView[] textViewArr = j9Var.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    j9Var.a();
                    j9Var.a();
                    Runnable runnable = j9Var.f34943r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                yh.q0 q0Var = ((yh.r0) obj).f53336j0;
                int i19 = yh.q0.f53289s;
                q0Var.a(i12);
                return;
            default:
                ((yh.q0) obj).a(i12);
                return;
        }
    }

    public m4(MessageObject messageObject, int i10) {
        this.f5591a = 23;
        this.f5592b = i10;
        this.f5593c = messageObject;
    }
}
