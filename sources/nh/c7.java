package nh;

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
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.xz0;
public final class c7 implements e9 {
    public final sl0 f15163a;
    public final xz0 f15164b;
    public final int[] f15165c;
    public final boolean d;
    public b7 e;
    public boolean f15166f;
    public boolean h;
    public boolean f15167n;
    public boolean f15168r;
    public int f15169s;

    public c7(sl0 sl0Var, boolean z4) {
        this.f15165c = new int[2];
        this.f15163a = sl0Var;
        this.d = z4;
        this.f15164b = null;
    }

    public static c7 a(sl0 sl0Var) {
        return new c7(sl0Var, false);
    }

    @Override
    public final void D0(long j10, int i10, k3 k3Var) {
        ArrayList arrayList;
        sl0 sl0Var = this.f15163a;
        if (sl0Var != null && (sl0Var.getParent() instanceof q)) {
            q qVar = (q) sl0Var.getParent();
            if (qVar.k(j10)) {
                qVar.V.add(k3Var);
                return;
            } else {
                k3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (sl0Var != null && (sl0Var.getParent() instanceof d5)) {
            d5 d5Var = (d5) sl0Var.getParent();
            pz pzVar = d5Var.f15273x;
            z4 z4Var = d5Var.f15272w;
            if (z4Var != null && (arrayList = z4Var.f16119c) != null && pzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        u4 u4Var = (u4) arrayList.get(i11);
                        if (u4Var != null) {
                            TL_stories.StoryReaction storyReaction = u4Var.f15961c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f19419id == i10) {
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
                        sl0Var.post(k3Var);
                        return;
                    }
                }
            }
            k3Var.run();
            return;
        }
        if (this.d) {
            t6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f15917a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        k3Var.run();
    }

    @Override
    public final boolean X0(long j10, int i10, int i11, int i12, f9 f9Var) {
        q qVar;
        ViewGroup viewGroup;
        boolean z4;
        c9 c9Var = null;
        f9Var.f15332a = null;
        f9Var.f15333b = null;
        f9Var.f15334c = null;
        f9Var.e = null;
        sl0 sl0Var = this.f15163a;
        if (sl0Var != null && (sl0Var.getParent() instanceof q)) {
            qVar = (q) sl0Var.getParent();
        } else {
            qVar = null;
        }
        if (qVar != null && !qVar.g()) {
            viewGroup = qVar.f15776r;
        } else {
            viewGroup = sl0Var;
        }
        ViewGroup viewGroup2 = this.f15164b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof p) {
                    p pVar = (p) childAt;
                    if (pVar.B == j10) {
                        f9Var.f15332a = childAt;
                        f9Var.f15333b = pVar.f15731r;
                        f9Var.f15341m = pVar.L;
                        f9Var.d = pVar.O;
                        q qVar2 = (q) pVar.getParent().getParent();
                        f9Var.f15336g = qVar2;
                        f9Var.f15337i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.f15339k = 1.0f;
                        if (pVar.D && qVar2.g()) {
                            f9Var.f15335f = new lh.m5(new Path(), 10);
                            return true;
                        }
                        f9Var.f15335f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.V1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.f21704r0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && r2Var.O())) {
                        f9Var.f15332a = childAt;
                        f9Var.f15341m = j2Var;
                        f9Var.f15333b = imageReceiver;
                        f9Var.f15336g = (View) r2Var.getParent();
                        if (z10) {
                            f9Var.f15340l = imageReceiver;
                            boolean z11 = j2Var.f15438w;
                        }
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        f9Var.f15332a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            f9Var.f15334c = t1Var.C9;
                        } else {
                            f9Var.f15334c = t1Var.getPhotoImage();
                        }
                        f9Var.f15336g = (View) t1Var.getParent();
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        f9Var.f15332a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            f9Var.f15333b = v0Var.getPhotoImage();
                        } else {
                            f9Var.f15334c = v0Var.getPhotoImage();
                        }
                        f9Var.f15336g = (View) v0Var.getParent();
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.r7) && sl0Var != null) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    MessageObject messageObject = r7Var.getMessageObject();
                    if ((r7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        bl0 fastScroll = sl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.f15332a = childAt;
                        f9Var.f15334c = r7Var.f21769c;
                        f9Var.e = new androidx.car.app.utils.a(r7Var, fastScroll, iArr, 10);
                        f9Var.f15336g = (View) r7Var.getParent();
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        y3 y3Var = vaVar.f22509a;
                        f9Var.f15332a = y3Var;
                        f9Var.f15341m = vaVar.Q;
                        f9Var.f15333b = y3Var.getImageReceiver();
                        f9Var.f15336g = (View) vaVar.getParent();
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.p9 p9Var = n6Var.h;
                    if (n6Var.f21451x != j10) {
                        continue;
                    } else {
                        if (p9Var != null && p9Var.getImageReceiver() != null && p9Var.getImageReceiver().getImageDrawable() != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (n6Var.f21447n == i11 && z4) {
                            f9Var.f15332a = p9Var;
                            f9Var.f15334c = p9Var.getImageReceiver();
                            f9Var.f15336g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.f15339k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.f15338j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        } else if (!z4) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f21445c;
                            f9Var.f15332a = m6Var;
                            f9Var.f15341m = n6Var.f21452y;
                            f9Var.f15333b = m6Var.getImageReceiver();
                            f9Var.f15336g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.f15339k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.f15338j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        f9Var.f15332a = h6Var;
                        f9Var.f15341m = h6Var.f21155r0;
                        f9Var.f15333b = h6Var.f21154r;
                        f9Var.f15336g = (View) h6Var.getParent();
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) childAt;
                    if (a8Var.getPostInfo().b() == i11) {
                        f9Var.f15332a = a8Var.getImageView();
                        f9Var.f15341m = a8Var.getStoryAvatarParams();
                        f9Var.f15334c = a8Var.getImageView().getImageReceiver();
                        f9Var.f15336g = (View) a8Var.getParent();
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j10 && b5Var.getStoryItem().messageId == i10) {
                        f9Var.f15332a = b5Var.getAvatarImageView();
                        f9Var.f15341m = b5Var.getStoryAvatarParams();
                        f9Var.f15333b = b5Var.getAvatarImageView().getImageReceiver();
                        f9Var.f15336g = (View) b5Var.getParent();
                        f9Var.f15339k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                c9Var = null;
            }
        }
        return false;
    }

    @Override
    public final void b(boolean z4) {
        b7 b7Var = this.e;
        if (b7Var != null) {
            b7Var.b(z4);
        }
    }

    public final void c(f9 f9Var) {
        View view = f9Var.f15336g;
        if (view == null) {
            return;
        }
        if (view instanceof a7) {
            int[] iArr = this.f15165c;
            ((a7) view).a(iArr);
            f9Var.h = iArr[0];
            f9Var.f15337i = iArr[1] - this.f15169s;
        } else if (view instanceof aa) {
            f9Var.h = ((aa) view).U2;
            f9Var.f15337i = (view.getMeasuredHeight() - f9Var.f15336g.getPaddingBottom()) - this.f15169s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.f15337i = (f9Var.f15336g.getMeasuredHeight() - f9Var.f15336g.getPaddingBottom()) - this.f15169s;
        }
    }

    public c7(xz0 xz0Var) {
        this.f15165c = new int[2];
        this.f15164b = xz0Var;
        this.f15163a = null;
    }
}
