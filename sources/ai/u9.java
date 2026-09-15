package ai;

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
import org.telegram.ui.q01;
public final class u9 implements fc {
    public final ll0 f1581a;
    public final q01 f1582b;
    public final int[] f1583c;
    public final boolean d;
    public t9 e;
    public boolean f1584f;
    public boolean h;
    public boolean f1585n;
    public boolean f1586r;
    public int f1587s;

    public u9(ll0 ll0Var, boolean z10) {
        this.f1583c = new int[2];
        this.f1581a = ll0Var;
        this.d = z10;
        this.f1582b = null;
    }

    public static u9 a(ll0 ll0Var) {
        return new u9(ll0Var, false);
    }

    @Override
    public final void Z(long j3, int i10, e5 e5Var) {
        ArrayList arrayList;
        ll0 ll0Var = this.f1581a;
        if (ll0Var != null && (ll0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) ll0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.f538b0.add(e5Var);
                return;
            } else {
                e5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (ll0Var != null && (ll0Var.getParent() instanceof j7)) {
            j7 j7Var = (j7) ll0Var.getParent();
            pz pzVar = j7Var.f1050x;
            e7 e7Var = j7Var.f1049w;
            if (e7Var != null && (arrayList = e7Var.f764c) != null && pzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        z6 z6Var = (z6) arrayList.get(i11);
                        if (z6Var != null) {
                            TL_stories.StoryReaction storyReaction = z6Var.f1782c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f18348id == i10) {
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
                        ll0Var.post(e5Var);
                        return;
                    }
                }
            }
            e5Var.run();
            return;
        }
        if (this.d) {
            l9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f1188a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        e5Var.run();
    }

    @Override
    public final void b(boolean z10) {
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.b(z10);
        }
    }

    public final void c(gc gcVar) {
        View view = gcVar.f914g;
        if (view == null) {
            return;
        }
        if (view instanceof s9) {
            int[] iArr = this.f1583c;
            ((s9) view).a(iArr);
            gcVar.h = iArr[0];
            gcVar.f915i = iArr[1] - this.f1587s;
        } else if (view instanceof org.telegram.ui.Components.ga) {
            gcVar.h = ((org.telegram.ui.Components.ga) view).X2;
            gcVar.f915i = (view.getMeasuredHeight() - gcVar.f914g.getPaddingBottom()) - this.f1587s;
        } else {
            gcVar.h = view.getPaddingTop();
            gcVar.f915i = (gcVar.f914g.getMeasuredHeight() - gcVar.f914g.getPaddingBottom()) - this.f1587s;
        }
    }

    @Override
    public final boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        b0 b0Var;
        ViewGroup viewGroup;
        boolean z10;
        dc dcVar = null;
        gcVar.f910a = null;
        gcVar.f911b = null;
        gcVar.f912c = null;
        gcVar.e = null;
        ll0 ll0Var = this.f1581a;
        if (ll0Var != null && (ll0Var.getParent() instanceof b0)) {
            b0Var = (b0) ll0Var.getParent();
        } else {
            b0Var = null;
        }
        if (b0Var != null && !b0Var.g()) {
            viewGroup = b0Var.f556r;
        } else {
            viewGroup = ll0Var;
        }
        ViewGroup viewGroup2 = this.f1582b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof a0) {
                    a0 a0Var = (a0) childAt;
                    if (a0Var.E == j3) {
                        gcVar.f910a = childAt;
                        gcVar.f911b = a0Var.f497r;
                        gcVar.f919m = a0Var.O;
                        gcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        gcVar.f914g = b0Var2;
                        gcVar.f915i = 0.0f;
                        gcVar.h = 0.0f;
                        gcVar.f917k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            gcVar.f913f = new a1.c(new Path(), 7);
                            return true;
                        }
                        gcVar.f913f = dcVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.f20758u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && r2Var.O())) {
                        gcVar.f910a = childAt;
                        gcVar.f919m = j2Var;
                        gcVar.f911b = imageReceiver;
                        gcVar.f914g = (View) r2Var.getParent();
                        if (z11) {
                            gcVar.f918l = imageReceiver;
                            boolean z12 = j2Var.f663w;
                        }
                        gcVar.f917k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        gcVar.f910a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            gcVar.f912c = t1Var.F9;
                        } else {
                            gcVar.f912c = t1Var.getPhotoImage();
                        }
                        gcVar.f914g = (View) t1Var.getParent();
                        gcVar.f917k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        gcVar.f910a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            gcVar.f911b = w0Var.getPhotoImage();
                        } else {
                            gcVar.f912c = w0Var.getPhotoImage();
                        }
                        gcVar.f914g = (View) w0Var.getParent();
                        gcVar.f917k = 1.0f;
                        c(gcVar);
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
                        gcVar.f910a = childAt;
                        gcVar.f912c = t7Var.f21375c;
                        gcVar.e = new r5(t7Var, fastScroll, iArr, 1);
                        gcVar.f914g = (View) t7Var.getParent();
                        gcVar.f917k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                    org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) childAt;
                    if (abVar.getDialogId() == j3) {
                        z5 z5Var = abVar.f19805a;
                        gcVar.f910a = z5Var;
                        gcVar.f919m = abVar.T;
                        gcVar.f911b = z5Var.getImageReceiver();
                        gcVar.f914g = (View) abVar.getParent();
                        gcVar.f917k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.u9 u9Var = n6Var.h;
                    if (n6Var.f20478x != j3) {
                        continue;
                    } else {
                        if (u9Var != null && u9Var.getImageReceiver() != null && u9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (n6Var.f20474n == i11 && z10) {
                            gcVar.f910a = u9Var;
                            gcVar.f912c = u9Var.getImageReceiver();
                            gcVar.f914g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            gcVar.f917k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.f916j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18907h5, n6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f20472c;
                            gcVar.f910a = m6Var;
                            gcVar.f919m = n6Var.f20479y;
                            gcVar.f911b = m6Var.getImageReceiver();
                            gcVar.f914g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            gcVar.f917k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.f916j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18907h5, n6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j3) {
                        gcVar.f910a = h6Var;
                        gcVar.f919m = h6Var.f20206u0;
                        gcVar.f911b = h6Var.f20201r;
                        gcVar.f914g = (View) h6Var.getParent();
                        gcVar.f917k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        gcVar.f910a = c8Var.getImageView();
                        gcVar.f919m = c8Var.getStoryAvatarParams();
                        gcVar.f912c = c8Var.getImageView().getImageReceiver();
                        gcVar.f914g = (View) c8Var.getParent();
                        gcVar.f917k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i10) {
                        gcVar.f910a = a5Var.getAvatarImageView();
                        gcVar.f919m = a5Var.getStoryAvatarParams();
                        gcVar.f911b = a5Var.getAvatarImageView().getImageReceiver();
                        gcVar.f914g = (View) a5Var.getParent();
                        gcVar.f917k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                dcVar = null;
            }
        }
        return false;
    }

    public u9(q01 q01Var) {
        this.f1583c = new int[2];
        this.f1582b = q01Var;
        this.f1581a = null;
    }
}
