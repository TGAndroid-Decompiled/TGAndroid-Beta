package bi;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.r01;
public final class d9 implements lb {
    public final ll0 f2868a;
    public final r01 f2869b;
    public final int[] f2870c;
    public final boolean d;
    public c9 f2871e;
    public boolean f2872f;
    public boolean h;
    public boolean f2873n;
    public boolean f2874r;
    public int f2875s;

    public d9(ll0 ll0Var, boolean z10) {
        this.f2870c = new int[2];
        this.f2868a = ll0Var;
        this.d = z10;
        this.f2869b = null;
    }

    public static d9 a(ll0 ll0Var) {
        return new d9(ll0Var, false);
    }

    @Override
    public final boolean H0(long j3, int i10, int i11, int i12, mb mbVar) {
        v vVar;
        ViewGroup viewGroup;
        boolean z10;
        jb jbVar = null;
        mbVar.f3333a = null;
        mbVar.f3334b = null;
        mbVar.f3335c = null;
        mbVar.f3336e = null;
        ll0 ll0Var = this.f2868a;
        if (ll0Var != null && (ll0Var.getParent() instanceof v)) {
            vVar = (v) ll0Var.getParent();
        } else {
            vVar = null;
        }
        if (vVar != null && !vVar.g()) {
            viewGroup = vVar.f3868r;
        } else {
            viewGroup = ll0Var;
        }
        ViewGroup viewGroup2 = this.f2869b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof u) {
                    u uVar = (u) childAt;
                    if (uVar.E == j3) {
                        mbVar.f3333a = childAt;
                        mbVar.f3334b = uVar.f3775r;
                        mbVar.f3343m = uVar.O;
                        mbVar.d = uVar.R;
                        v vVar2 = (v) uVar.getParent().getParent();
                        mbVar.f3338g = vVar2;
                        mbVar.f3339i = 0.0f;
                        mbVar.h = 0.0f;
                        mbVar.f3341k = 1.0f;
                        if (uVar.G && vVar2.g()) {
                            mbVar.f3337f = new a1.c(new Path(), 7);
                            return true;
                        }
                        mbVar.f3337f = jbVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.f22633u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && r2Var.O())) {
                        mbVar.f3333a = childAt;
                        mbVar.f3343m = j2Var;
                        mbVar.f3334b = imageReceiver;
                        mbVar.f3338g = (View) r2Var.getParent();
                        if (z11) {
                            mbVar.f3342l = imageReceiver;
                            boolean z12 = j2Var.f3166w;
                        }
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        mbVar.f3333a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            mbVar.f3335c = t1Var.F9;
                        } else {
                            mbVar.f3335c = t1Var.getPhotoImage();
                        }
                        mbVar.f3338g = (View) t1Var.getParent();
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        mbVar.f3333a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            mbVar.f3334b = w0Var.getPhotoImage();
                        } else {
                            mbVar.f3335c = w0Var.getPhotoImage();
                        }
                        mbVar.f3338g = (View) w0Var.getParent();
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && ll0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        sk0 fastScroll = ll0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        mbVar.f3333a = childAt;
                        mbVar.f3335c = t7Var.f23262c;
                        mbVar.f3336e = new androidx.car.app.utils.a(t7Var, fastScroll, iArr, 3);
                        mbVar.f3338g = (View) t7Var.getParent();
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.za) {
                    org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                    if (zaVar.getDialogId() == j3) {
                        i5 i5Var = zaVar.f23632a;
                        mbVar.f3333a = i5Var;
                        mbVar.f3343m = zaVar.T;
                        mbVar.f3334b = i5Var.getImageReceiver();
                        mbVar.f3338g = (View) zaVar.getParent();
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.x9 x9Var = n6Var.h;
                    if (n6Var.f22342x != j3) {
                        continue;
                    } else {
                        if (x9Var != null && x9Var.getImageReceiver() != null && x9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (n6Var.f22338n == i11 && z10) {
                            mbVar.f3333a = x9Var;
                            mbVar.f3335c = x9Var.getImageReceiver();
                            mbVar.f3338g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            mbVar.f3341k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                mbVar.f3340j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, n6Var.getResourcesProvider()));
                            }
                            b(mbVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f22335c;
                            mbVar.f3333a = m6Var;
                            mbVar.f3343m = n6Var.f22343y;
                            mbVar.f3334b = m6Var.getImageReceiver();
                            mbVar.f3338g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            mbVar.f3341k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                mbVar.f3340j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, n6Var.getResourcesProvider()));
                            }
                            b(mbVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j3) {
                        mbVar.f3333a = h6Var;
                        mbVar.f3343m = h6Var.f22051u0;
                        mbVar.f3334b = h6Var.f22046r;
                        mbVar.f3338g = (View) h6Var.getParent();
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        mbVar.f3333a = c8Var.getImageView();
                        mbVar.f3343m = c8Var.getStoryAvatarParams();
                        mbVar.f3335c = c8Var.getImageView().getImageReceiver();
                        mbVar.f3338g = (View) c8Var.getParent();
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i10) {
                        mbVar.f3333a = a5Var.getAvatarImageView();
                        mbVar.f3343m = a5Var.getStoryAvatarParams();
                        mbVar.f3334b = a5Var.getAvatarImageView().getImageReceiver();
                        mbVar.f3338g = (View) a5Var.getParent();
                        mbVar.f3341k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                jbVar = null;
            }
        }
        return false;
    }

    public final void b(mb mbVar) {
        View view = mbVar.f3338g;
        if (view == null) {
            return;
        }
        if (view instanceof b9) {
            int[] iArr = this.f2870c;
            ((b9) view).a(iArr);
            mbVar.h = iArr[0];
            mbVar.f3339i = iArr[1] - this.f2875s;
        } else if (view instanceof org.telegram.ui.Components.ia) {
            mbVar.h = ((org.telegram.ui.Components.ia) view).X2;
            mbVar.f3339i = (view.getMeasuredHeight() - mbVar.f3338g.getPaddingBottom()) - this.f2875s;
        } else {
            mbVar.h = view.getPaddingTop();
            mbVar.f3339i = (mbVar.f3338g.getMeasuredHeight() - mbVar.f3338g.getPaddingBottom()) - this.f2875s;
        }
    }

    @Override
    public final void e(boolean z10) {
        c9 c9Var = this.f2871e;
        if (c9Var != null) {
            c9Var.e(z10);
        }
    }

    @Override
    public final void p(long j3, int i10, p4 p4Var) {
        ArrayList arrayList;
        ll0 ll0Var = this.f2868a;
        if (ll0Var != null && (ll0Var.getParent() instanceof v)) {
            v vVar = (v) ll0Var.getParent();
            if (vVar.k(j3)) {
                vVar.f3849b0.add(p4Var);
                return;
            } else {
                p4Var.run();
                return;
            }
        }
        int i11 = 0;
        if (ll0Var != null && (ll0Var.getParent() instanceof s6)) {
            s6 s6Var = (s6) ll0Var.getParent();
            pz pzVar = s6Var.f3699x;
            n6 n6Var = s6Var.f3698w;
            if (n6Var != null && (arrayList = n6Var.f3370c) != null && pzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        i6 i6Var = (i6) arrayList.get(i11);
                        if (i6Var != null) {
                            TL_stories.StoryReaction storyReaction = i6Var.f3098c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f20107id == i10) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    int L0 = pzVar.L0();
                    int N0 = pzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        pzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        ll0Var.post(p4Var);
                        return;
                    }
                }
            }
            p4Var.run();
            return;
        }
        if (this.d) {
            u8 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f3805a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        p4Var.run();
    }

    public d9(r01 r01Var) {
        this.f2870c = new int[2];
        this.f2869b = r01Var;
        this.f2868a = null;
    }
}
