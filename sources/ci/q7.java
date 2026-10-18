package ci;

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
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.uz0;
public final class q7 implements v9 {
    public final im0 f5787a;
    public final uz0 f5788b;
    public final int[] f5789c;
    public final boolean d;
    public p7 e;
    public boolean f5790f;
    public boolean h;
    public boolean f5791n;
    public boolean f5792r;
    public int f5793s;

    public q7(im0 im0Var, boolean z10) {
        this.f5789c = new int[2];
        this.f5787a = im0Var;
        this.d = z10;
        this.f5788b = null;
    }

    public static q7 a(im0 im0Var) {
        return new q7(im0Var, false);
    }

    @Override
    public final boolean Q0(long j10, int i10, int i11, int i12, w9 w9Var) {
        r rVar;
        ViewGroup viewGroup;
        boolean z10;
        t9 t9Var = null;
        w9Var.f6060a = null;
        w9Var.f6061b = null;
        w9Var.f6062c = null;
        w9Var.e = null;
        im0 im0Var = this.f5787a;
        if (im0Var != null && (im0Var.getParent() instanceof r)) {
            rVar = (r) im0Var.getParent();
        } else {
            rVar = null;
        }
        if (rVar != null && !rVar.g()) {
            viewGroup = rVar.f5828r;
        } else {
            viewGroup = im0Var;
        }
        ViewGroup viewGroup2 = this.f5788b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    if (qVar.E == j10) {
                        w9Var.f6060a = childAt;
                        w9Var.f6061b = qVar.f5756r;
                        w9Var.f6069m = qVar.O;
                        w9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        w9Var.f6064g = rVar2;
                        w9Var.f6065i = 0.0f;
                        w9Var.h = 0.0f;
                        w9Var.f6067k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            w9Var.f6063f = new a1.c(new Path(), 18);
                            return true;
                        }
                        w9Var.f6063f = t9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = r2Var.f22901u0;
                    int i14 = (r2Var.getDialogId() > j10 ? 1 : (r2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && r2Var.O())) {
                        w9Var.f6060a = childAt;
                        w9Var.f6069m = k2Var;
                        w9Var.f6061b = imageReceiver;
                        w9Var.f6064g = (View) r2Var.getParent();
                        if (z11) {
                            w9Var.f6068l = imageReceiver;
                            boolean z12 = k2Var.f6130w;
                        }
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        w9Var.f6060a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            w9Var.f6062c = u1Var.F9;
                        } else {
                            w9Var.f6062c = u1Var.getPhotoImage();
                        }
                        w9Var.f6064g = (View) u1Var.getParent();
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        w9Var.f6060a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            w9Var.f6061b = w0Var.getPhotoImage();
                        } else {
                            w9Var.f6062c = w0Var.getPhotoImage();
                        }
                        w9Var.f6064g = (View) w0Var.getParent();
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.s7) && im0Var != null) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    MessageObject messageObject = s7Var.getMessageObject();
                    if ((s7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        pl0 fastScroll = im0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        w9Var.f6060a = childAt;
                        w9Var.f6062c = s7Var.f23023c;
                        w9Var.e = new ai.r2(s7Var, fastScroll, iArr, 4);
                        w9Var.f6064g = (View) s7Var.getParent();
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        j4 j4Var = vaVar.f23658a;
                        w9Var.f6060a = j4Var;
                        w9Var.f6069m = vaVar.T;
                        w9Var.f6061b = j4Var.getImageReceiver();
                        w9Var.f6064g = (View) vaVar.getParent();
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.w9 w9Var2 = n6Var.h;
                    if (n6Var.f22645y != j10) {
                        continue;
                    } else {
                        if (w9Var2 != null && w9Var2.getImageReceiver() != null && w9Var2.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (n6Var.f22640n == i11 && z10) {
                            w9Var.f6060a = w9Var2;
                            w9Var.f6062c = w9Var2.getImageReceiver();
                            w9Var.f6064g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            w9Var.f6067k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                w9Var.f6066j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, n6Var.getResourcesProvider()));
                            }
                            c(w9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f22638c;
                            w9Var.f6060a = m6Var;
                            w9Var.f6069m = n6Var.E;
                            w9Var.f6061b = m6Var.getImageReceiver();
                            w9Var.f6064g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            w9Var.f6067k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                w9Var.f6066j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, n6Var.getResourcesProvider()));
                            }
                            c(w9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        w9Var.f6060a = h6Var;
                        w9Var.f6069m = h6Var.f22356u0;
                        w9Var.f6061b = h6Var.f22351r;
                        w9Var.f6064g = (View) h6Var.getParent();
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) childAt;
                    if (b8Var.getPostInfo().b() == i11) {
                        w9Var.f6060a = b8Var.getImageView();
                        w9Var.f6069m = b8Var.getStoryAvatarParams();
                        w9Var.f6062c = b8Var.getImageView().getImageReceiver();
                        w9Var.f6064g = (View) b8Var.getParent();
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i10) {
                        w9Var.f6060a = a5Var.getAvatarImageView();
                        w9Var.f6069m = a5Var.getStoryAvatarParams();
                        w9Var.f6061b = a5Var.getAvatarImageView().getImageReceiver();
                        w9Var.f6064g = (View) a5Var.getParent();
                        w9Var.f6067k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                t9Var = null;
            }
        }
        return false;
    }

    @Override
    public final void X0(long j10, int i10, s3 s3Var) {
        ArrayList arrayList;
        im0 im0Var = this.f5787a;
        if (im0Var != null && (im0Var.getParent() instanceof r)) {
            r rVar = (r) im0Var.getParent();
            if (rVar.k(j10)) {
                rVar.f5810b0.add(s3Var);
                return;
            } else {
                s3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (im0Var != null && (im0Var.getParent() instanceof t5)) {
            t5 t5Var = (t5) im0Var.getParent();
            yz yzVar = t5Var.f5955x;
            o5 o5Var = t5Var.f5954w;
            if (o5Var != null && (arrayList = o5Var.f5632c) != null && yzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        j5 j5Var = (j5) arrayList.get(i11);
                        if (j5Var != null) {
                            TL_stories.StoryReaction storyReaction = j5Var.f5470c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f20506id == i10) {
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
                    int L0 = yzVar.L0();
                    int N0 = yzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        yzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        im0Var.post(s3Var);
                        return;
                    }
                }
            }
            s3Var.run();
            return;
        }
        if (this.d) {
            h7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f5397a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        s3Var.run();
    }

    @Override
    public final void b(boolean z10) {
        p7 p7Var = this.e;
        if (p7Var != null) {
            p7Var.b(z10);
        }
    }

    public final void c(w9 w9Var) {
        View view = w9Var.f6064g;
        if (view == null) {
            return;
        }
        if (view instanceof o7) {
            int[] iArr = this.f5789c;
            ((o7) view).a(iArr);
            w9Var.h = iArr[0];
            w9Var.f6065i = iArr[1] - this.f5793s;
        } else if (view instanceof org.telegram.ui.Components.ia) {
            w9Var.h = ((org.telegram.ui.Components.ia) view).V2;
            w9Var.f6065i = (view.getMeasuredHeight() - w9Var.f6064g.getPaddingBottom()) - this.f5793s;
        } else {
            w9Var.h = view.getPaddingTop();
            w9Var.f6065i = (w9Var.f6064g.getMeasuredHeight() - w9Var.f6064g.getPaddingBottom()) - this.f5793s;
        }
    }

    public q7(uz0 uz0Var) {
        this.f5789c = new int[2];
        this.f5788b = uz0Var;
        this.f5787a = null;
    }
}
