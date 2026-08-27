package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import hh.y9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.mr;
import org.telegram.ui.rr;

public final class x3 extends lr {

    public boolean f14121c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final i9 f14122e;

    public final boolean f14123f;

    public final boolean f14124g;
    public final boolean h;

    public final Context f14125i;

    public final b4 f14126j;

    public final boolean[] f14127k;

    public final e4 f14128l;

    public x3(e4 e4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c6 c6Var2, i9 i9Var, boolean z10, boolean z11, boolean z12, Context context2, b4 b4Var, boolean[] zArr) {
        super(context, c6Var, true);
        this.f14128l = e4Var;
        this.d = c6Var2;
        this.f14122e = i9Var;
        this.f14123f = z10;
        this.f14124g = z11;
        this.h = z12;
        this.f14125i = context2;
        this.f14126j = b4Var;
        this.f14127k = zArr;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.c6 c6Var;
        final x3 x3Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        i9 i9Var;
        i9 i9Var2;
        final i9 i9Var3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        TLRPC.Chat chat;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        d1 d1Var;
        TLRPC.GroupCall groupCall;
        d1 d1Var2;
        Integer num;
        ArrayList arrayList;
        lh.z7 z7Var;
        org.telegram.ui.Components.t5[] t5VarArr;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        TLRPC.InputStickerSet inputStickerSet2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Chat chat2;
        TLObject tLObject;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        final i9 i9Var4;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        TLRPC.Chat chat3;
        boolean z11;
        boolean z12;
        Integer num2 = 1;
        e4 e4Var = this.f14128l;
        c4 c4Var = e4Var.K1;
        boolean z13 = this.f14124g;
        Context context = this.f14125i;
        i9 i9Var5 = this.f14122e;
        org.telegram.ui.ActionBar.c6 c6Var3 = this.d;
        if (z13 || c4Var.f13142b != null) {
            c6Var = c6Var3;
            x3Var = this;
            TL_stories.StoryItem storyItem3 = c4Var.f13141a;
            if (c4Var.f13142b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, x3Var.d).setOnClickListener(new o3(x3Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem3 == null) {
                return;
            }
            if ((e4Var.f13295y1 || e4Var.O1.h(e4Var.f13291x1)) && !c4Var.f13145f && (storyItem = c4Var.f13141a) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                b70 b70Var = new b70(actionBarPopupWindow$ActionBarPopupWindowLayout2, c6Var);
                b70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new y9(actionBarPopupWindow$ActionBarPopupWindowLayout2, 13), false);
                b70Var.k();
                f6 f6VarB = e4Var.getStoriesController().B(e4Var.f13291x1, true);
                f6 f6VarB2 = e4Var.O1.B(e4Var.f13291x1, false);
                b70.f(b70Var, f6VarB, hashSet, f6VarB2 != null && f6VarB2.a(), new j3.m(x3Var, c6Var, storyItem, 3), new cg.e1(x3Var, hashSet, storyItem, c6Var, 4));
                int iB = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(b70Var.B);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, e4Var.getContext(), x3Var.d, false, false);
                e4Var.A3 = f1Var;
                f1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.f1 f1Var2 = e4Var.A3;
                f1Var2.C = new s3(actionBarPopupWindow$ActionBarPopupWindowLayout2, iB, 1);
                f1Var2.setOnClickListener(new o3(x3Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(e4Var.A3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.f22693c = true;
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(e4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c6Var);
                k1Var.setTag(R.id.fit_width_tag, num2);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(k1Var, h7.z5.n(-1, 8));
            }
            if (e4Var.f13295y1) {
                lh.o9 o9Var = storyItem3.privacy.isEmpty() ? new lh.o9(3, e4Var.f13296y2, new ArrayList()) : new lh.o9(e4Var.f13296y2, storyItem3.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, x3Var.d);
                f1VarC.setSubtext(o9Var.toString());
                f1VarC.setOnClickListener(new gg.f(x3Var, o9Var, storyItem3, 10));
                f1VarC.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            x3Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (e4Var.f13295y1 || x3Var.f14123f) {
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(e4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c6Var);
                k1Var2.setTag(R.id.fit_width_tag, num2);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(k1Var2, h7.z5.n(-1, 8));
            }
            if (e4Var.Y2 || c4Var.f13145f || !((e4Var.I0() || MessagesController.getInstance(e4Var.f13296y2).storiesEnabled()) && x3Var.h)) {
                i9Var = i9Var5;
            } else {
                org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(e4Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, x3Var.d);
                e4Var.f13258o1 = f1VarC2;
                i9Var = i9Var5;
                f1VarC2.setOnClickListener(new b0(x3Var, x3Var.d, x3Var.f14125i, i9Var5, x3Var.f14126j, 2));
                if (e4Var.O1.K(e4Var.f13291x1) && c4Var.f13144e && !SharedConfig.allowPreparingHevcPlayers()) {
                    e4Var.f13258o1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem4 = c4Var.f13141a;
            if (storyItem4 == null || !c4Var.f13144e || c4Var.f13145f || !(storyItem4.pinned || e4Var.J0())) {
                i9Var2 = i9Var;
            } else {
                i9Var2 = i9Var;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, x3Var.d).setOnClickListener(new b0(x3Var, x3Var.f14125i, storyItem3, i9Var2, x3Var.f14126j, 3));
            }
            if ((e4Var.f13295y1 || (e4Var.f13299z1 && MessagesController.getInstance(e4Var.f13296y2).getStoriesController().h(storyItem3.dialogId))) && !c4Var.f13145f) {
                boolean z14 = storyItem3.pinned;
                boolean z15 = !z14;
                i9Var3 = i9Var2;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z14 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, e4Var.f13295y1 ? LocaleController.getString(!z14 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z14 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, x3Var.d).setOnClickListener(new ag.u1(x3Var, storyItem3, z15, c6Var, 1));
            } else {
                i9Var3 = i9Var2;
            }
            x3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout, storyItem3);
            if (e4Var.Y2 || c4Var.f13145f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout4, R.drawable.msg_gallery, LocaleController.getString(c4Var.f13144e ? R.string.SaveVideo : R.string.SaveImage), false, x3Var.d).setOnClickListener(new o3(x3Var, 7));
            }
            if (!MessagesController.getInstance(e4Var.f13296y2).premiumFeaturesBlocked() && !c4Var.f13145f && !e4Var.f13299z1) {
                e4.b0(e4Var, actionBarPopupWindow$ActionBarPopupWindowLayout4);
            }
            if (e4Var.f13299z1 && e4Var.Q2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout4, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, x3Var.d).setOnClickListener(new o3(x3Var, 8));
            }
            if (e4Var.Q2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, x3Var.d).setOnClickListener(new o3(x3Var, 9));
            }
            TL_stories.StoryItem storyItem5 = c4Var.f13141a;
            if (storyItem5 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem5.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (d1Var2 = d1.S) != null && d1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    d1 d1Var3 = d1.S;
                    boolean z16 = d1Var3 != null && d1Var3.o();
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z16 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z16 ? R.string.Unmute : R.string.Mute), false, x3Var.d).setOnClickListener(new a2(1, x3Var, z16));
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, x3Var.d).setOnClickListener(new o3(x3Var, 10));
                }
            }
            if (c4Var.f13145f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, x3Var.d).setOnClickListener(new View.OnClickListener(x3Var) {

                    public final x3 f13819b;

                    {
                        this.f13819b = x3Var;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                x3 x3Var2 = this.f13819b.f14128l.f13261p1;
                                if (x3Var2 != null) {
                                    x3Var2.a();
                                }
                                i9Var3.N();
                                break;
                            default:
                                x3 x3Var3 = this.f13819b.f14128l.f13261p1;
                                if (x3Var3 != null) {
                                    x3Var3.a();
                                }
                                i9Var3.N();
                                break;
                        }
                    }
                });
            }
            if (c4Var.f13145f && (e4Var.f13291x1 == UserConfig.getInstance(e4Var.f13296y2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(e4Var.f13296y2).getChat(Long.valueOf(-e4Var.f13291x1))) || ((d1Var = i9Var3.f13512w0) != null && c4Var.k(d1Var.g()) && (groupCall = i9Var3.f13512w0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, x3Var.d).setOnClickListener(new q3(x3Var, c6Var, i9Var3, 1));
            }
            if (c4Var.f13145f) {
                org.telegram.ui.ActionBar.f1 f1VarC3 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, x3Var.d);
                int i12 = org.telegram.ui.ActionBar.g6.f23284q7;
                f1VarC3.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
                f1VarC3.c(c6Var.N0(i12), c6Var.N0(i12));
                f1VarC3.setOnClickListener(new q3(x3Var, c6Var, i9Var3, 2));
            }
            if (c4Var.f13145f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout;
            } else {
                if (!e4Var.f13295y1) {
                    s6 storiesController = MessagesController.getInstance(e4Var.f13296y2).getStoriesController();
                    TL_stories.StoryItem storyItem6 = c4Var.f13141a;
                    int i13 = storiesController.f13955a;
                    if (storyItem6 == null || storyItem6.dialogId == UserConfig.getInstance(i13).getClientUserId() || ((storyItem6.dialogId <= 0 || (user = MessagesController.getInstance(i13).getUser(Long.valueOf(storyItem6.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem6.dialogId >= 0 || (chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-storyItem6.dialogId))) == null || (!chat.creator && ((!(z10 = storyItem6.out) || (tL_chatAdminRights2 = chat.admin_rights) == null || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.delete_stories)) && (z10 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.delete_stories)))))) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.f1 f1VarC4 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, x3Var.d);
                int i14 = org.telegram.ui.ActionBar.g6.f23284q7;
                f1VarC4.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i14, c6Var)));
                f1VarC4.c(c6Var.N0(i14), c6Var.N0(i14));
                f1VarC4.setOnClickListener(new o3(x3Var, 13));
            }
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            i9 i9Var6 = i9Var5;
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(e4Var.f13291x1, 0L);
            boolean zC0 = NotificationsCustomSettingsActivity.c0(e4Var.f13296y2, e4Var.f13291x1);
            if (e4Var.f13291x1 > 0) {
                user2 = MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1));
                tLObject = user2;
                chat2 = null;
            } else {
                chat2 = MessagesController.getInstance(e4Var.f13296y2).getChat(Long.valueOf(-e4Var.f13291x1));
                tLObject = chat2;
                user2 = null;
            }
            String strTrim = user2 == null ? chat2 == null ? "" : chat2.title : UserObject.getFirstName(user2).trim();
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            final String str = strTrim;
            if (UserObject.isService(e4Var.f13291x1) || e4Var.I0()) {
                x3Var = this;
                c6Var2 = c6Var3;
                i9Var6 = i9Var6;
            } else {
                if (zC0) {
                    chat3 = chat2;
                    c6Var2 = c6Var3;
                    org.telegram.ui.ActionBar.f1 f1VarC5 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.c6 c6Var4 = this.d;
                    final TLObject tLObject2 = tLObject;
                    x3Var = this;
                    f1VarC5.setOnClickListener(new View.OnClickListener(this) {

                        public final x3 f14042b;

                        {
                            this.f14042b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i16 = i15;
                            String str2 = str;
                            TLObject tLObject3 = tLObject2;
                            org.telegram.ui.ActionBar.c6 c6Var5 = c6Var4;
                            String str3 = sharedPrefKey;
                            x3 x3Var2 = this.f14042b;
                            switch (i16) {
                                case 0:
                                    e4 e4Var2 = x3Var2.f14128l;
                                    MessagesController.getNotificationsSettings(e4Var2.f13296y2).edit().putBoolean("stories_" + str3, false).apply();
                                    NotificationsController.getInstance(e4Var2.f13296y2).updateServerNotificationsSettings(e4Var2.f13291x1, 0L);
                                    ec ecVarV = new mc(e4Var2.Y0, c6Var5).V(Arrays.asList(tLObject3), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    ecVarV.f28013a = 2;
                                    ecVarV.j();
                                    x3 x3Var3 = e4Var2.f13261p1;
                                    if (x3Var3 != null) {
                                        x3Var3.a();
                                    }
                                    break;
                                default:
                                    e4 e4Var3 = x3Var2.f14128l;
                                    MessagesController.getNotificationsSettings(e4Var3.f13296y2).edit().putBoolean("stories_" + str3, true).apply();
                                    NotificationsController.getInstance(e4Var3.f13296y2).updateServerNotificationsSettings(e4Var3.f13291x1, 0L);
                                    ec ecVarV2 = new mc(e4Var3.Y0, c6Var5).V(Arrays.asList(tLObject3), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    ecVarV2.f28013a = 2;
                                    ecVarV2.j();
                                    x3 x3Var4 = e4Var3.f13261p1;
                                    if (x3Var4 != null) {
                                        x3Var4.a();
                                    }
                                    break;
                            }
                        }
                    });
                    f1VarC5.setMultiline(false);
                } else {
                    x3Var = this;
                    chat3 = chat2;
                    c6Var2 = c6Var3;
                    final TLObject tLObject3 = tLObject;
                    org.telegram.ui.ActionBar.f1 f1VarC6 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, x3Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.c6 c6Var5 = x3Var.d;
                    f1VarC6.setOnClickListener(new View.OnClickListener(x3Var) {

                        public final x3 f14042b;

                        {
                            this.f14042b = x3Var;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i17 = i16;
                            String str2 = str;
                            TLObject tLObject4 = tLObject3;
                            org.telegram.ui.ActionBar.c6 c6Var6 = c6Var5;
                            String str3 = sharedPrefKey;
                            x3 x3Var2 = this.f14042b;
                            switch (i17) {
                                case 0:
                                    e4 e4Var2 = x3Var2.f14128l;
                                    MessagesController.getNotificationsSettings(e4Var2.f13296y2).edit().putBoolean("stories_" + str3, false).apply();
                                    NotificationsController.getInstance(e4Var2.f13296y2).updateServerNotificationsSettings(e4Var2.f13291x1, 0L);
                                    ec ecVarV = new mc(e4Var2.Y0, c6Var6).V(Arrays.asList(tLObject4), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    ecVarV.f28013a = 2;
                                    ecVarV.j();
                                    x3 x3Var3 = e4Var2.f13261p1;
                                    if (x3Var3 != null) {
                                        x3Var3.a();
                                    }
                                    break;
                                default:
                                    e4 e4Var3 = x3Var2.f14128l;
                                    MessagesController.getNotificationsSettings(e4Var3.f13296y2).edit().putBoolean("stories_" + str3, true).apply();
                                    NotificationsController.getInstance(e4Var3.f13296y2).updateServerNotificationsSettings(e4Var3.f13291x1, 0L);
                                    ec ecVarV2 = new mc(e4Var3.Y0, c6Var6).V(Arrays.asList(tLObject4), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    ecVarV2.f28013a = 2;
                                    ecVarV2.j();
                                    x3 x3Var4 = e4Var3.f13261p1;
                                    if (x3Var4 != null) {
                                        x3Var4.a();
                                    }
                                    break;
                            }
                        }
                    });
                    f1VarC6.setMultiline(false);
                }
                MediaDataController.getInstance(e4Var.f13296y2).loadHints(true);
                boolean z17 = (user2 == 0 || user2.contact || !MediaDataController.getInstance(e4Var.f13296y2).containsTopPeer(e4Var.f13291x1)) ? false : true;
                if (e4Var.f13291x1 > 0) {
                    z11 = user2 != 0 && user2.contact;
                    if (user2 == 0 || !user2.stories_hidden) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } else {
                    TLRPC.Chat chat4 = chat3;
                    z11 = (chat4 == null || ChatObject.isNotInChat(chat4)) ? false : true;
                    if (chat4 == null || !chat4.stories_hidden) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                }
                if (z17) {
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, x3Var.d).setOnClickListener(new o3(x3Var, 14));
                } else if (z11) {
                    if (z12) {
                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, x3Var.d).setOnClickListener(new o3(x3Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, x3Var.d).setOnClickListener(new o3(x3Var, 15));
                    }
                }
            }
            if (c4Var.f13145f) {
                final int i17 = 0;
                i9Var4 = i9Var6;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, x3Var.d).setOnClickListener(new View.OnClickListener(x3Var) {

                    public final x3 f13819b;

                    {
                        this.f13819b = x3Var;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                x3 x3Var2 = this.f13819b.f14128l.f13261p1;
                                if (x3Var2 != null) {
                                    x3Var2.a();
                                }
                                i9Var4.N();
                                break;
                            default:
                                x3 x3Var3 = this.f13819b.f14128l.f13261p1;
                                if (x3Var3 != null) {
                                    x3Var3.a();
                                }
                                i9Var4.N();
                                break;
                        }
                    }
                });
            } else {
                i9Var4 = i9Var6;
            }
            if (MessagesController.getInstance(e4Var.f13296y2).premiumFeaturesBlocked() || !c4Var.f13144e) {
                i10 = -1;
            } else {
                boolean z18 = MessagesController.getInstance(e4Var.f13296y2).storyQualityFull;
                if (UserConfig.getInstance(e4Var.f13296y2).isPremium()) {
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z18 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z18 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, e4Var.f13290x0).setOnClickListener(new a2(0, e4Var, z18));
                    i10 = -1;
                } else {
                    Drawable drawable = e4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    i2 i2Var = new i2(e4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int iDp = AndroidUtilities.dp(24.0f);
                    int iDp2 = AndroidUtilities.dp(24.0f);
                    i2Var.f27823e = iDp;
                    i2Var.f27824f = iDp2;
                    int iDp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    i2Var.f27827s = iDp3;
                    i2Var.v = i18;
                    org.telegram.ui.ActionBar.f1 f1VarC7 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, e4Var.f13290x0);
                    f1VarC7.setOnClickListener(new x1(e4Var, 7));
                    f1VarC7.setIcon(i2Var);
                }
            }
            if (e4Var.Y2 || !e4Var.O2 || c4Var.f13145f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            } else {
                if (UserConfig.getInstance(e4Var.f13296y2).isPremium()) {
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, x3Var.d).setOnClickListener(new o3(x3Var, 1));
                } else if (!MessagesController.getInstance(e4Var.f13296y2).premiumFeaturesBlocked()) {
                    Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                    drawable2.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                    i2 i2Var2 = new i2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                    actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    org.telegram.ui.ActionBar.f1 f1VarC8 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, x3Var.d);
                    f1VarC8.setIcon(i2Var2);
                    f1VarC8.setOnClickListener(new gg.f(x3Var, f1VarC8, i9Var4, 11));
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (!MessagesController.getInstance(e4Var.f13296y2).premiumFeaturesBlocked() && !e4Var.f13299z1) {
                e4.b0(e4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (e4Var.Q2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, x3Var.d).setOnClickListener(new o3(x3Var, 2));
            }
            if (e4Var.Q2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, x3Var.d).setOnClickListener(new o3(x3Var, 3));
            }
            TL_stories.StoryItem storyItem7 = c4Var.f13141a;
            if (storyItem7 == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            } else {
                if (storyItem7.translated && TextUtils.equals(storyItem7.translatedLng, b31.C())) {
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, x3Var.d).setOnClickListener(new o3(x3Var, 4));
                } else if (MessagesController.getInstance(e4Var.f13296y2).getTranslateController().canTranslateStory(c4Var.f13141a)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, x3Var.d).setOnClickListener(new o3(x3Var, 5));
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            x3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout6, c4Var.f13141a);
            if (e4Var.Y2 || UserObject.isService(e4Var.f13291x1) || e4Var.I0()) {
                c6Var = c6Var2;
            } else {
                c6Var = c6Var2;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, x3Var.d).setOnClickListener(new q3(x3Var, i9Var4, c6Var));
            }
        }
        boolean z19 = (c4Var == null || (storyItem2 = c4Var.f13141a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = c4Var.f13141a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (c4Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = c4Var.f13141a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < c4Var.f13141a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = c4Var.f13141a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document documentF = org.telegram.ui.Components.k5.f(e4Var.f13296y2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (documentF != null && (inputStickerSet2 = MessageObject.getInputStickerSet(documentF)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.f22400id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.f22400id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = c4Var.f13141a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                r6 r6Var = c4Var.f13142b;
                if (r6Var != null && (z7Var = r6Var.f13907c) != null) {
                    if (z7Var.T0 != null) {
                        for (int i20 = 0; i20 < c4Var.f13142b.f13907c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) c4Var.f13142b.f13907c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document documentF2 = org.telegram.ui.Components.k5.f(e4Var.f13296y2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (documentF2 != null && (inputStickerSet = MessageObject.getInputStickerSet(documentF2)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.f22400id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.f22400id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = c4Var.f13142b.f13907c.C0;
                    if ((charSequence instanceof Spanned) && (t5VarArr = (org.telegram.ui.Components.t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class)) != null) {
                        int i21 = 0;
                        while (i21 < t5VarArr.length) {
                            org.telegram.ui.Components.t5 t5Var = t5VarArr[i21];
                            TLRPC.Document documentF3 = t5Var.document;
                            if (documentF3 == null) {
                                documentF3 = org.telegram.ui.Components.k5.f(e4Var.f13296y2, t5Var.documentId);
                            }
                            if (documentF3 != null) {
                                TLRPC.InputStickerSet inputStickerSet3 = MessageObject.getInputStickerSet(documentF3);
                                if (!hashSet2.contains(Long.valueOf(inputStickerSet3.f22400id))) {
                                    hashSet2.add(Long.valueOf(inputStickerSet3.f22400id));
                                    arrayList3.add(inputStickerSet3);
                                }
                            }
                            i21++;
                            num2 = num2;
                        }
                    }
                }
            } else {
                for (int i22 = 0; i22 < c4Var.f13141a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = c4Var.f13141a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document documentF4 = tL_messageEntityCustomEmoji.document;
                        if (documentF4 == null) {
                            documentF4 = org.telegram.ui.Components.k5.f(e4Var.f13296y2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (documentF4 != null) {
                            TLRPC.InputStickerSet inputStickerSet4 = MessageObject.getInputStickerSet(documentF4);
                            if (!hashSet2.contains(Long.valueOf(inputStickerSet4.f22400id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet4.f22400id));
                                arrayList3.add(inputStickerSet4);
                            }
                        }
                    }
                }
            }
            num = num2;
            arrayList = arrayList3;
        } else {
            num = num2;
            arrayList = null;
        }
        boolean z20 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z19 || z20) {
            org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context, org.telegram.ui.ActionBar.g6.H8, c6Var);
            k1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var3, h7.z5.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = c4Var.f13141a.media;
            TLObject tLObject4 = messageMedia3.document;
            if (tLObject4 == null) {
                tLObject4 = messageMedia3.photo;
            }
            d8 d8Var = new d8(x3Var.f14125i, e4Var.f13296y2, tLObject4, c4Var.f13141a, z19, arrayList, x3Var.d);
            d8Var.setOnClickListener(new ag.q0(25, x3Var, d8Var));
            d8Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(d8Var, h7.z5.n(-1, -2));
        }
    }

    @Override
    public final void c() {
        if (!this.f14121c && !this.f14127k[0]) {
            AndroidUtilities.runOnUIThread(new r3(this, 0));
        }
        e4 e4Var = this.f14128l;
        e4Var.f13261p1 = null;
        e4Var.f13258o1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        c4 c4Var;
        boolean z11 = this.f14123f;
        e4 e4Var = this.f14128l;
        if (!z11 || ((c4Var = e4Var.K1) != null && c4Var.f13142b != null)) {
            e4Var.f13297y3 = null;
            e4Var.f13301z3 = null;
            return;
        }
        Context context = e4Var.getContext();
        hg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final g5.b bVar = new g5.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 11);
        rr rrVar = new rr();
        org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[5];
        rrVar.f42321c = f1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        rrVar.f42319a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        f1VarC.setOnClickListener(new mr(swipeBack, 1));
        f1VarC.c(-328966, -328966);
        f1VarC.setSelectorColor(268435455);
        View dVar = new ag.d(context, 11);
        dVar.setMinimumWidth(AndroidUtilities.dp(196.0f));
        dVar.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(dVar);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        dVar.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(context, null);
        rrVar.f42320b = b1Var;
        b1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        b1Var.setDrawShadow(false);
        b1Var.setBackgroundColor(-14540254);
        b1Var.setTextColor(-1);
        b1Var.setOnValueChange(new org.telegram.ui.b5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b1Var, h7.z5.n(-1, 44));
        View dVar2 = new ag.d(context, 12);
        dVar2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        dVar2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(dVar2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) dVar2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        dVar2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        f1VarC2.c(-328966, -328966);
        final int i10 = 0;
        f1VarC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC2.setSelectorColor(268435455);
        f1VarArr[0] = f1VarC2;
        org.telegram.ui.ActionBar.f1 f1VarC3 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        f1VarC3.c(-328966, -328966);
        final int i11 = 1;
        f1VarC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC3.setSelectorColor(268435455);
        f1VarArr[1] = f1VarC3;
        org.telegram.ui.ActionBar.f1 f1VarC4 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        f1VarC4.c(-328966, -328966);
        final int i12 = 2;
        f1VarC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC4.setSelectorColor(268435455);
        f1VarArr[2] = f1VarC4;
        org.telegram.ui.ActionBar.f1 f1VarC5 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        f1VarC5.c(-328966, -328966);
        final int i13 = 3;
        f1VarC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC5.setSelectorColor(268435455);
        f1VarArr[3] = f1VarC5;
        org.telegram.ui.ActionBar.f1 f1VarC6 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        f1VarC6.c(-328966, -328966);
        final int i14 = 4;
        f1VarC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        f1VarC6.setSelectorColor(268435455);
        f1VarArr[4] = f1VarC6;
        e4Var.f13297y3 = rrVar;
        rrVar.a(i9.f13461x1, true);
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, e4Var.getContext(), this.d, false, false);
        e4Var.f13301z3 = f1Var;
        f1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        e4.a0(e4Var, true);
        e4Var.f13301z3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        e4Var.f13301z3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e4Var.f13301z3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) e4Var.f13301z3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        e4Var.f13301z3.setLayoutParams(layoutParams3);
        int iB = actionBarPopupWindow$ActionBarPopupWindowLayout.b(e4Var.f13297y3.f42319a);
        org.telegram.ui.ActionBar.f1 f1Var2 = e4Var.f13301z3;
        f1Var2.C = new s3(actionBarPopupWindow$ActionBarPopupWindowLayout, iB, 0);
        f1Var2.setOnClickListener(new o3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.f22693c = true;
        if (z10) {
            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(e4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, this.d);
            k1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, h7.z5.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        e4 e4Var = this.f14128l;
        if (!e4Var.f13299z1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(e4Var.f13296y2).getChat(Long.valueOf(-e4Var.f13291x1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(e4Var.f13296y2).getChatFull(chat.f22380id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(e4Var.f13296y2).loadChatInfo(chat.f22380id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new gh.a4(this, storyItem, this.f14122e, chat, 1));
    }
}
