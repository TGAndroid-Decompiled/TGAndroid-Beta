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
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.sz0;
public final class r7 implements w9 {
    public final jm0 f5921a;
    public final sz0 f5922b;
    public final int[] f5923c;
    public final boolean d;
    public q7 e;
    public boolean f5924f;
    public boolean h;
    public boolean f5925n;
    public boolean f5926r;
    public int f5927s;

    public r7(jm0 jm0Var, boolean z10) {
        this.f5923c = new int[2];
        this.f5921a = jm0Var;
        this.d = z10;
        this.f5922b = null;
    }

    public static r7 a(jm0 jm0Var) {
        return new r7(jm0Var, false);
    }

    @Override
    public final boolean Q0(long j10, int i10, int i11, int i12, x9 x9Var) {
        r rVar;
        ViewGroup viewGroup;
        boolean z10;
        u9 u9Var = null;
        x9Var.f6172a = null;
        x9Var.f6173b = null;
        x9Var.f6174c = null;
        x9Var.e = null;
        jm0 jm0Var = this.f5921a;
        if (jm0Var != null && (jm0Var.getParent() instanceof r)) {
            rVar = (r) jm0Var.getParent();
        } else {
            rVar = null;
        }
        if (rVar != null && !rVar.g()) {
            viewGroup = rVar.f5887r;
        } else {
            viewGroup = jm0Var;
        }
        ViewGroup viewGroup2 = this.f5922b;
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
                        x9Var.f6172a = childAt;
                        x9Var.f6173b = qVar.f5743r;
                        x9Var.f6181m = qVar.O;
                        x9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        x9Var.f6176g = rVar2;
                        x9Var.f6177i = 0.0f;
                        x9Var.h = 0.0f;
                        x9Var.f6179k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            x9Var.f6175f = new a1.c(new Path(), 18);
                            return true;
                        }
                        x9Var.f6175f = u9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = r2Var.f22908u0;
                    int i14 = (r2Var.getDialogId() > j10 ? 1 : (r2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && r2Var.O())) {
                        x9Var.f6172a = childAt;
                        x9Var.f6181m = k2Var;
                        x9Var.f6173b = imageReceiver;
                        x9Var.f6176g = (View) r2Var.getParent();
                        if (z11) {
                            x9Var.f6180l = imageReceiver;
                            boolean z12 = k2Var.f6227w;
                        }
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        x9Var.f6172a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            x9Var.f6174c = u1Var.F9;
                        } else {
                            x9Var.f6174c = u1Var.getPhotoImage();
                        }
                        x9Var.f6176g = (View) u1Var.getParent();
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        x9Var.f6172a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            x9Var.f6173b = w0Var.getPhotoImage();
                        } else {
                            x9Var.f6174c = w0Var.getPhotoImage();
                        }
                        x9Var.f6176g = (View) w0Var.getParent();
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.s7) && jm0Var != null) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    MessageObject messageObject = s7Var.getMessageObject();
                    if ((s7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        ql0 fastScroll = jm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        x9Var.f6172a = childAt;
                        x9Var.f6174c = s7Var.f23030c;
                        x9Var.e = new ai.u2(s7Var, fastScroll, iArr, 4);
                        x9Var.f6176g = (View) s7Var.getParent();
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        k4 k4Var = vaVar.f23665a;
                        x9Var.f6172a = k4Var;
                        x9Var.f6181m = vaVar.T;
                        x9Var.f6173b = k4Var.getImageReceiver();
                        x9Var.f6176g = (View) vaVar.getParent();
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.w9 w9Var = n6Var.h;
                    if (n6Var.f22652y != j10) {
                        continue;
                    } else {
                        if (w9Var != null && w9Var.getImageReceiver() != null && w9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (n6Var.f22647n == i11 && z10) {
                            x9Var.f6172a = w9Var;
                            x9Var.f6174c = w9Var.getImageReceiver();
                            x9Var.f6176g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            x9Var.f6179k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                x9Var.f6178j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, n6Var.getResourcesProvider()));
                            }
                            c(x9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f22645c;
                            x9Var.f6172a = m6Var;
                            x9Var.f6181m = n6Var.E;
                            x9Var.f6173b = m6Var.getImageReceiver();
                            x9Var.f6176g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            x9Var.f6179k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                x9Var.f6178j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, n6Var.getResourcesProvider()));
                            }
                            c(x9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        x9Var.f6172a = h6Var;
                        x9Var.f6181m = h6Var.f22363u0;
                        x9Var.f6173b = h6Var.f22358r;
                        x9Var.f6176g = (View) h6Var.getParent();
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) childAt;
                    if (b8Var.getPostInfo().b() == i11) {
                        x9Var.f6172a = b8Var.getImageView();
                        x9Var.f6181m = b8Var.getStoryAvatarParams();
                        x9Var.f6174c = b8Var.getImageView().getImageReceiver();
                        x9Var.f6176g = (View) b8Var.getParent();
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i10) {
                        x9Var.f6172a = a5Var.getAvatarImageView();
                        x9Var.f6181m = a5Var.getStoryAvatarParams();
                        x9Var.f6173b = a5Var.getAvatarImageView().getImageReceiver();
                        x9Var.f6176g = (View) a5Var.getParent();
                        x9Var.f6179k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                u9Var = null;
            }
        }
        return false;
    }

    @Override
    public final void X0(long j10, int i10, t3 t3Var) {
        ArrayList arrayList;
        jm0 jm0Var = this.f5921a;
        if (jm0Var != null && (jm0Var.getParent() instanceof r)) {
            r rVar = (r) jm0Var.getParent();
            if (rVar.k(j10)) {
                rVar.f5869b0.add(t3Var);
                return;
            } else {
                t3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (jm0Var != null && (jm0Var.getParent() instanceof u5)) {
            u5 u5Var = (u5) jm0Var.getParent();
            yz yzVar = u5Var.f6054x;
            p5 p5Var = u5Var.f6053w;
            if (p5Var != null && (arrayList = p5Var.f5730c) != null && yzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        k5 k5Var = (k5) arrayList.get(i11);
                        if (k5Var != null) {
                            TL_stories.StoryReaction storyReaction = k5Var.f5563c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f20513id == i10) {
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
                        jm0Var.post(t3Var);
                        return;
                    }
                }
            }
            t3Var.run();
            return;
        }
        if (this.d) {
            i7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f5491a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        t3Var.run();
    }

    @Override
    public final void b(boolean z10) {
        q7 q7Var = this.e;
        if (q7Var != null) {
            q7Var.b(z10);
        }
    }

    public final void c(x9 x9Var) {
        View view = x9Var.f6176g;
        if (view == null) {
            return;
        }
        if (view instanceof p7) {
            int[] iArr = this.f5923c;
            ((p7) view).a(iArr);
            x9Var.h = iArr[0];
            x9Var.f6177i = iArr[1] - this.f5927s;
        } else if (view instanceof org.telegram.ui.Components.ia) {
            x9Var.h = ((org.telegram.ui.Components.ia) view).V2;
            x9Var.f6177i = (view.getMeasuredHeight() - x9Var.f6176g.getPaddingBottom()) - this.f5927s;
        } else {
            x9Var.h = view.getPaddingTop();
            x9Var.f6177i = (x9Var.f6176g.getMeasuredHeight() - x9Var.f6176g.getPaddingBottom()) - this.f5927s;
        }
    }

    public r7(sz0 sz0Var) {
        this.f5923c = new int[2];
        this.f5922b = sz0Var;
        this.f5921a = null;
    }
}
