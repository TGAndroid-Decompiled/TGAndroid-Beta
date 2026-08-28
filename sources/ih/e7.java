package ih;

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
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.mz0;
public final class e7 implements i9 {
    public final wk0 f11367a;
    public final mz0 f11368b;
    public final int[] f11369c;
    public final boolean d;
    public d7 f11370e;
    public boolean f11371f;
    public boolean h;
    public boolean f11372n;
    public boolean f11373r;
    public int f11374s;

    public e7(wk0 wk0Var, boolean z10) {
        this.f11369c = new int[2];
        this.f11367a = wk0Var;
        this.d = z10;
        this.f11368b = null;
    }

    public static e7 a(wk0 wk0Var) {
        return new e7(wk0Var, false);
    }

    @Override
    public final void T(long j10, int i9, n3 n3Var) {
        ArrayList arrayList;
        wk0 wk0Var = this.f11367a;
        if (wk0Var != null && (wk0Var.getParent() instanceof r)) {
            r rVar = (r) wk0Var.getParent();
            if (rVar.k(j10)) {
                rVar.U.add(n3Var);
                return;
            } else {
                n3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (wk0Var != null && (wk0Var.getParent() instanceof g5)) {
            g5 g5Var = (g5) wk0Var.getParent();
            bz bzVar = g5Var.f11484x;
            c5 c5Var = g5Var.f11483w;
            if (c5Var != null && (arrayList = c5Var.f11289c) != null && bzVar != null) {
                while (true) {
                    if (i10 < arrayList.size()) {
                        x4 x4Var = (x4) arrayList.get(i10);
                        if (x4Var != null) {
                            TL_stories.StoryReaction storyReaction = x4Var.f12321c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f22617id == i9) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    int L0 = bzVar.L0();
                    int N0 = bzVar.N0();
                    if (i10 < L0 || i10 > N0) {
                        bzVar.h1(i10, AndroidUtilities.dp(60.0f));
                        wk0Var.post(n3Var);
                        return;
                    }
                }
            }
            n3Var.run();
            return;
        }
        if (this.d) {
            v6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f12236a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        n3Var.run();
    }

    public final void b(j9 j9Var) {
        View view = j9Var.f11647g;
        if (view == null) {
            return;
        }
        if (view instanceof c7) {
            int[] iArr = this.f11369c;
            ((c7) view).a(iArr);
            j9Var.h = iArr[0];
            j9Var.f11648i = iArr[1] - this.f11374s;
        } else if (view instanceof aa) {
            j9Var.h = ((aa) view).T2;
            j9Var.f11648i = (view.getMeasuredHeight() - j9Var.f11647g.getPaddingBottom()) - this.f11374s;
        } else {
            j9Var.h = view.getPaddingTop();
            j9Var.f11648i = (j9Var.f11647g.getMeasuredHeight() - j9Var.f11647g.getPaddingBottom()) - this.f11374s;
        }
    }

    @Override
    public final void d(boolean z10) {
        d7 d7Var = this.f11370e;
        if (d7Var != null) {
            d7Var.d(z10);
        }
    }

    @Override
    public final boolean y0(long j10, int i9, int i10, int i11, j9 j9Var) {
        r rVar;
        ViewGroup viewGroup;
        boolean z10;
        g9 g9Var = null;
        j9Var.f11642a = null;
        j9Var.f11643b = null;
        j9Var.f11644c = null;
        j9Var.f11645e = null;
        wk0 wk0Var = this.f11367a;
        if (wk0Var != null && (wk0Var.getParent() instanceof r)) {
            rVar = (r) wk0Var.getParent();
        } else {
            rVar = null;
        }
        if (rVar != null && !rVar.g()) {
            viewGroup = rVar.f12040r;
        } else {
            viewGroup = wk0Var;
        }
        ViewGroup viewGroup2 = this.f11368b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i12 = 0;
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    if (qVar.A == j10) {
                        j9Var.f11642a = childAt;
                        j9Var.f11643b = qVar.f11985r;
                        j9Var.f11652m = qVar.K;
                        j9Var.d = qVar.N;
                        r rVar2 = (r) qVar.getParent().getParent();
                        j9Var.f11647g = rVar2;
                        j9Var.f11648i = 0.0f;
                        j9Var.h = 0.0f;
                        j9Var.f11650k = 1.0f;
                        if (qVar.C && rVar2.g()) {
                            j9Var.f11646f = new gh.i3(new Path(), 23);
                            return true;
                        }
                        j9Var.f11646f = g9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.U1;
                    org.telegram.ui.Cells.k2 k2Var = r2Var.f25032q0;
                    long dialogId = r2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j10 && !z11) || (z11 && r2Var.N())) {
                        j9Var.f11642a = childAt;
                        j9Var.f11652m = k2Var;
                        j9Var.f11643b = imageReceiver;
                        j9Var.f11647g = (View) r2Var.getParent();
                        if (z11) {
                            j9Var.f11651l = imageReceiver;
                            boolean z12 = k2Var.f11735w;
                        }
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i9) {
                        j9Var.f11642a = childAt;
                        if (i11 != 1 && i11 != 2) {
                            j9Var.f11644c = t1Var.B9;
                        } else {
                            j9Var.f11644c = t1Var.getPhotoImage();
                        }
                        j9Var.f11647g = (View) t1Var.getParent();
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i9) {
                        j9Var.f11642a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            j9Var.f11643b = w0Var.getPhotoImage();
                        } else {
                            j9Var.f11644c = w0Var.getPhotoImage();
                        }
                        j9Var.f11647g = (View) w0Var.getParent();
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.r7) && wk0Var != null) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    MessageObject messageObject = r7Var.getMessageObject();
                    if ((r7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i10 && messageObject.storyItem.dialogId == j10)) {
                        fk0 fastScroll = wk0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        j9Var.f11642a = childAt;
                        j9Var.f11644c = r7Var.f25094c;
                        j9Var.f11645e = new androidx.car.app.utils.a(r7Var, fastScroll, iArr, 9);
                        j9Var.f11647g = (View) r7Var.getParent();
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        d4 d4Var = vaVar.f25804a;
                        j9Var.f11642a = d4Var;
                        j9Var.f11652m = vaVar.P;
                        j9Var.f11643b = d4Var.getImageReceiver();
                        j9Var.f11647g = (View) vaVar.getParent();
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.o9 o9Var = n6Var.h;
                    if (n6Var.f24770x != j10) {
                        continue;
                    } else {
                        if (o9Var != null && o9Var.getImageReceiver() != null && o9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (n6Var.f24766n == i10 && z10) {
                            j9Var.f11642a = o9Var;
                            j9Var.f11644c = o9Var.getImageReceiver();
                            j9Var.f11647g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            j9Var.f11650k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                j9Var.f11649j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, n6Var.getResourcesProvider()));
                            }
                            b(j9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.f24763c;
                            j9Var.f11642a = m6Var;
                            j9Var.f11652m = n6Var.f24771y;
                            j9Var.f11643b = m6Var.getImageReceiver();
                            j9Var.f11647g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            j9Var.f11650k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                j9Var.f11649j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, n6Var.getResourcesProvider()));
                            }
                            b(j9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        j9Var.f11642a = h6Var;
                        j9Var.f11652m = h6Var.f24456q0;
                        j9Var.f11643b = h6Var.f24457r;
                        j9Var.f11647g = (View) h6Var.getParent();
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) childAt;
                    if (a8Var.getPostInfo().b() == i10) {
                        j9Var.f11642a = a8Var.getImageView();
                        j9Var.f11652m = a8Var.getStoryAvatarParams();
                        j9Var.f11644c = a8Var.getImageView().getImageReceiver();
                        j9Var.f11647g = (View) a8Var.getParent();
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j10 && b5Var.getStoryItem().messageId == i9) {
                        j9Var.f11642a = b5Var.getAvatarImageView();
                        j9Var.f11652m = b5Var.getStoryAvatarParams();
                        j9Var.f11643b = b5Var.getAvatarImageView().getImageReceiver();
                        j9Var.f11647g = (View) b5Var.getParent();
                        j9Var.f11650k = 1.0f;
                        b(j9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                g9Var = null;
            }
        }
        return false;
    }

    public e7(mz0 mz0Var) {
        this.f11369c = new int[2];
        this.f11368b = mz0Var;
        this.f11367a = null;
    }
}
