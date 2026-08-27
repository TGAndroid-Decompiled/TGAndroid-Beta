package hh;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import lh.sb;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z20;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aq0;
import org.telegram.ui.bp0;
import org.telegram.ui.eh1;
import org.telegram.ui.gz0;
import org.telegram.ui.hz0;
import org.telegram.ui.jp0;
import org.telegram.ui.np0;
import org.telegram.ui.pg0;
import org.telegram.ui.q91;
import org.telegram.ui.qg0;
import org.telegram.ui.rg1;
import org.telegram.ui.rn;
import org.telegram.ui.w70;
import org.telegram.ui.xl0;
import org.telegram.ui.xm0;
import org.telegram.ui.y70;
import org.telegram.ui.zs0;

public final class z0 implements View.OnClickListener {

    public final int f10402a;

    public final int f10403b;

    public final Object f10404c;

    public z0(Object obj, int i10, int i11) {
        this.f10402a = i11;
        this.f10404c = obj;
        this.f10403b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11 = this.f10402a;
        int i12 = 4;
        int i13 = 2;
        int i14 = 1;
        int i15 = this.f10403b;
        Object obj = this.f10404c;
        switch (i11) {
            case 0:
                k1 k1Var = ((l1) obj).f9643f0;
                int i16 = k1.f9570s;
                k1Var.a(i15);
                break;
            case 1:
                ((k1) obj).a(i15);
                break;
            case 2:
                lh.ka kaVar = (lh.ka) obj;
                if (!kaVar.f16230e.contains(Integer.valueOf(i15))) {
                    kaVar.f16230e.add(Integer.valueOf(i15));
                } else if (kaVar.f16230e.size() > 1) {
                    kaVar.f16230e.remove(Integer.valueOf(i15));
                }
                AndroidUtilities.forEachViews((RecyclerView) kaVar.f16228b, (d5.d) new ig.i(kaVar, i12));
                break;
            case 3:
                lh.i6 i6Var = ((lh.g6) obj).f16038b;
                if (i6Var.f16115r && (callback = i6Var.f16113f) != null) {
                    callback.run(Integer.valueOf(i15));
                    break;
                }
                break;
            case 4:
                ((rn) obj).G9(i15);
                break;
            case 5:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i15 == 0) {
                    g0Var.Z = !g0Var.Z;
                } else if (i15 == 1) {
                    g0Var.f28477a0 = !g0Var.f28477a0;
                } else if (i15 == 2) {
                    g0Var.f28478b0 = !g0Var.f28478b0;
                }
                g0Var.T.N(true);
                g0Var.t();
                break;
            case 6:
                boolean[] zArr = (boolean[]) obj;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                break;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
                chatAttachAlertPhotoLayout.f34900b.T0.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.f26277w.M(null, null);
                break;
            case 8:
                ((z20) obj).f35135b.x(i15, true);
                break;
            case 9:
                z20 z20Var = ((y20) obj).f34792c;
                z20Var.n(i15);
                z20Var.dismiss();
                break;
            case 10:
                oc0 oc0Var = (oc0) obj;
                if (oc0Var.f31253e.getAdapter() instanceof mc0) {
                    yy yyVar = ((qx) ((mc0) oc0Var.f31253e.getAdapter())).f31990c;
                    if ((i15 == 1 || i15 == 2) && yyVar.f35036s1) {
                        yyVar.R(true, false, i15 == 1);
                    } else if (i15 == 0 && yyVar.f35032r1) {
                        yyVar.R(true, true, false);
                    }
                }
                oc0Var.f31253e.x(i15, false);
                break;
            case 11:
                org.telegram.ui.Components.k4 k4Var = (org.telegram.ui.Components.k4) obj;
                EditTextBoldCursor editTextBoldCursor = k4Var.f29405c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                k4Var.d.run(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                k4Var.dismiss();
                break;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i15, scrollSlidingTextTabStrip.f26508a.indexOfChild(view));
                break;
            case 13:
                r51 r51Var = (r51) obj;
                int i17 = r51Var.f32089b.f26470i.f28309q;
                if (i17 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    r51Var.updateAppUpdateViews(i15, true);
                } else if (i17 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    r51Var.updateAppUpdateViews(i15, true);
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", r51Var.d, null, false);
                    }
                }
                break;
            case 14:
                ((org.telegram.ui.Components.voip.u0) obj).f33914b.x(i15, true);
                break;
            case 15:
                eh1 eh1Var = (eh1) obj;
                if (eh1Var.Q == null && view.getAlpha() != 0.0f) {
                    eh1Var.c(i15, true);
                    break;
                }
                break;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 17:
                y70 y70Var = (y70) obj;
                y70Var.M.dismiss();
                int i18 = y70Var.V;
                if (i18 >= 0) {
                    y70Var.W.setKeepMedia(i18, i15);
                    w70 w70Var = y70Var.f44719a0;
                    if (w70Var != null) {
                        w70Var.a(i15);
                    }
                } else {
                    w70 w70Var2 = y70Var.f44719a0;
                    if (w70Var2 != null) {
                        w70Var2.a(i15);
                    }
                }
                break;
            case 18:
                qg0 qg0Var = (qg0) obj;
                ValueAnimator valueAnimator = qg0Var.f42640c.M;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    rg1 rg1Var = qg0Var.f42640c;
                    if (!rg1Var.D) {
                        if (rg1Var.getCurrentPosition() == i15) {
                            Object objX = qg0Var.X();
                            if (objX instanceof pg0) {
                                ((pg0) objX).t();
                            }
                        } else {
                            qg0Var.m0(i15, true);
                            qg0Var.f42640c.D(i15);
                        }
                        break;
                    }
                }
                break;
            case 19:
                xm0 xm0Var = (xm0) obj;
                xl0 xl0Var = xm0Var.f44539z1;
                xm0Var.O0 = i15;
                if (i15 == 1) {
                    xm0Var.f44491e0 = xm0Var.f44486c0;
                } else if (i15 == 4) {
                    xm0Var.f44491e0 = xm0Var.f44488d0;
                } else if (i15 == 2) {
                    xm0Var.f44491e0 = xm0Var.f44480a0;
                } else if (i15 == 3) {
                    xm0Var.f44491e0 = xm0Var.f44483b0;
                } else {
                    xm0Var.f44491e0 = xm0Var.Z;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, xm0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xm0Var.f44495f1);
                    PhotoViewer.t1().b2(arrayList, 0, xl0Var);
                } else if (i15 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(xm0Var.f44499h1);
                    PhotoViewer.t1().b2(arrayList2, 0, xl0Var);
                } else if (i15 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(xm0Var.f44501i1);
                    PhotoViewer.t1().b2(arrayList3, 0, xl0Var);
                } else if (i15 == 0) {
                    PhotoViewer photoViewerT1 = PhotoViewer.t1();
                    ArrayList arrayList4 = xm0Var.f44492e1;
                    photoViewerT1.b2(arrayList4, arrayList4.indexOf(secureDocument), xl0Var);
                } else {
                    PhotoViewer photoViewerT2 = PhotoViewer.t1();
                    ArrayList arrayList5 = xm0Var.f44497g1;
                    photoViewerT2.b2(arrayList5, arrayList5.indexOf(secureDocument), xl0Var);
                }
                break;
            case 20:
                jp0 jp0Var = (jp0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = jp0Var.E;
                if (n1Var != null && n1Var.isShowing()) {
                    jp0Var.E.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.y4.L(jp0Var.getParentActivity(), jp0Var.B.a(), new bp0(jp0Var, i13));
                } else {
                    jp0Var.V(jp0Var.f39462b, jp0Var.f39463c, true, 0);
                    jp0Var.finishFragment();
                }
                break;
            case 21:
                aq0 aq0Var = (aq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = aq0Var.f36609i0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    aq0Var.f36609i0.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.y4.L(aq0Var.getParentActivity(), aq0Var.Q.a(), new np0(aq0Var, i14));
                } else {
                    aq0Var.e0(0, true);
                }
                break;
            case 22:
                MessageObject messageObject = (MessageObject) obj;
                int i19 = PopupNotificationActivity.X;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i15).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i15 == 0) {
                    hz0 hz0Var = profileActivity.K;
                    if (!hz0Var.f29163y1) {
                        if (hu0.w0(hz0Var.getClosestTab())) {
                            hz0 hz0Var2 = profileActivity.K;
                            profileActivity.K.O0(profileActivity, profileActivity.a(), hz0Var2.h1(hz0Var2.getClosestTab()));
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            sb sbVarE = sb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            sbVarE.f16817x = new gz0(profileActivity);
                            sbVarE.R(null);
                        } else {
                            profileActivity.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                        }
                    }
                }
                if (!hu0.w0(profileActivity.K.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.t8 t8Var = profileActivity.f36060t5;
                    if (t8Var != null) {
                        t8Var.run();
                        profileActivity.f36060t5 = null;
                    }
                    ec.e();
                    boolean z12 = profileActivity.K.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected != null) {
                        i10 = 0;
                        for (int i20 = 0; i20 < actionModeSelected.size(); i20++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i20).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                                i10++;
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    profileActivity.K.L(false);
                    if (z12) {
                        profileActivity.K.Y0(8);
                    }
                    if (!arrayList6.isEmpty()) {
                        boolean[] zArr2 = new boolean[arrayList6.size()];
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList6.get(i21);
                            zArr2[i21] = storyItem2.pinned;
                            storyItem2.pinned = z12;
                        }
                        profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList6, false);
                        boolean[] zArr3 = {false};
                        boolean z13 = z12;
                        profileActivity.f36060t5 = new org.telegram.messenger.t8(profileActivity, clientUserId, arrayList6, z13, 9);
                        gh.k1 k1Var2 = new gh.k1(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 15);
                        (z13 ? mc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), k1Var2).j() : mc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, k1Var2).j()).v = new zs0(18, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long jA = profileActivity.a();
                    hz0 hz0Var3 = profileActivity.K;
                    int iH1 = hz0Var3.h1(hz0Var3.getClosestTab());
                    String strW = profileActivity.getMessagesController().getStoriesController().w(iH1, jA);
                    org.telegram.messenger.t8 t8Var2 = profileActivity.f36060t5;
                    if (t8Var2 != null) {
                        t8Var2.run();
                        profileActivity.f36060t5 = null;
                    }
                    ec.e();
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i22 = 0; i22 < actionModeSelected2.size(); i22++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i22).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.K.L(false);
                    if (!arrayList7.isEmpty()) {
                        b9 b9Var = new b9(profileActivity, jA, iH1, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(iH1, jA, arrayList7);
                        mc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), strW)), LocaleController.getString(R.string.UndoNoCaps), b9Var).j();
                        break;
                    }
                }
                break;
            case 24:
                q91 q91Var = (q91) obj;
                q91Var.f41557e0.D(i15);
                q91Var.m0(i15, true);
                break;
            case 25:
                ((rh.x1) obj).L.Y3(i15);
                break;
            case 26:
                View.OnClickListener onClickListener = ((sg.e) obj).f47901b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            default:
                sg.a aVar = ((sg.g) obj).h;
                if (aVar != null) {
                    aVar.k(i15);
                }
                break;
        }
    }

    public z0(MessageObject messageObject, int i10) {
        this.f10402a = 22;
        this.f10403b = i10;
        this.f10404c = messageObject;
    }
}
