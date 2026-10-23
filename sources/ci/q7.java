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
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.wz0;
public final class q7 implements v9 {
    public final mm0 f5791a;
    public final wz0 f5792b;
    public final int[] f5793c;
    public final boolean d;
    public p7 e;
    public boolean f5794f;
    public boolean h;
    public boolean f5795n;
    public boolean f5796r;
    public int f5797s;

    public q7(mm0 mm0Var, boolean z10) {
        this.f5793c = new int[2];
        this.f5791a = mm0Var;
        this.d = z10;
        this.f5792b = null;
    }

    public static q7 a(mm0 mm0Var) {
        return new q7(mm0Var, false);
    }

    @Override
    public final boolean Q0(long j10, int i10, int i11, int i12, w9 w9Var) {
        r rVar;
        ViewGroup viewGroup;
        boolean z10;
        t9 t9Var = null;
        w9Var.f6067a = null;
        w9Var.f6068b = null;
        w9Var.f6069c = null;
        w9Var.e = null;
        mm0 mm0Var = this.f5791a;
        if (mm0Var != null && (mm0Var.getParent() instanceof r)) {
            rVar = (r) mm0Var.getParent();
        } else {
            rVar = null;
        }
        if (rVar != null && !rVar.g()) {
            viewGroup = rVar.f5832r;
        } else {
            viewGroup = mm0Var;
        }
        ViewGroup viewGroup2 = this.f5792b;
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
                        w9Var.f6067a = childAt;
                        w9Var.f6068b = qVar.f5760r;
                        w9Var.f6076m = qVar.O;
                        w9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        w9Var.f6071g = rVar2;
                        w9Var.f6072i = 0.0f;
                        w9Var.h = 0.0f;
                        w9Var.f6074k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            w9Var.f6070f = new a1.c(new Path(), 18);
                            return true;
                        }
                        w9Var.f6070f = t9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q2) {
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                    ImageReceiver imageReceiver = q2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = q2Var.f23018u0;
                    int i14 = (q2Var.getDialogId() > j10 ? 1 : (q2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && q2Var.N())) {
                        w9Var.f6067a = childAt;
                        w9Var.f6076m = j2Var;
                        w9Var.f6068b = imageReceiver;
                        w9Var.f6071g = (View) q2Var.getParent();
                        if (z11) {
                            w9Var.f6075l = imageReceiver;
                            boolean z12 = j2Var.f6137w;
                        }
                        w9Var.f6074k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        w9Var.f6067a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            w9Var.f6069c = t1Var.F9;
                        } else {
                            w9Var.f6069c = t1Var.getPhotoImage();
                        }
                        w9Var.f6071g = (View) t1Var.getParent();
                        w9Var.f6074k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        w9Var.f6067a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            w9Var.f6068b = v0Var.getPhotoImage();
                        } else {
                            w9Var.f6069c = v0Var.getPhotoImage();
                        }
                        w9Var.f6071g = (View) v0Var.getParent();
                        w9Var.f6074k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.s7) && mm0Var != null) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    MessageObject messageObject = s7Var.getMessageObject();
                    if ((s7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        tl0 fastScroll = mm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        w9Var.f6067a = childAt;
                        w9Var.f6069c = s7Var.f23263c;
                        w9Var.e = new ai.u2(s7Var, fastScroll, iArr, 4);
                        w9Var.f6071g = (View) s7Var.getParent();
                        w9Var.f6074k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof wa) {
                    wa waVar = (wa) childAt;
                    if (waVar.getDialogId() == j10) {
                        j4 j4Var = waVar.f23924a;
                        w9Var.f6067a = j4Var;
                        w9Var.f6076m = waVar.T;
                        w9Var.f6068b = j4Var.getImageReceiver();
                        w9Var.f6071g = (View) waVar.getParent();
                        w9Var.f6074k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.w9 w9Var2 = o6Var.h;
                    if (o6Var.f22852y != j10) {
                        continue;
                    } else {
                        if (w9Var2 != null && w9Var2.getImageReceiver() != null && w9Var2.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o6Var.f22847n == i11 && z10) {
                            w9Var.f6067a = w9Var2;
                            w9Var.f6069c = w9Var2.getImageReceiver();
                            w9Var.f6071g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            w9Var.f6074k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                w9Var.f6073j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21254h5, o6Var.getResourcesProvider()));
                            }
                            c(w9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.f22845c;
                            w9Var.f6067a = n6Var;
                            w9Var.f6076m = o6Var.E;
                            w9Var.f6068b = n6Var.getImageReceiver();
                            w9Var.f6071g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            w9Var.f6074k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                w9Var.f6073j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21254h5, o6Var.getResourcesProvider()));
                            }
                            c(w9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j10) {
                        w9Var.f6067a = i6Var;
                        w9Var.f6076m = i6Var.f22530u0;
                        w9Var.f6068b = i6Var.f22525r;
                        w9Var.f6071g = (View) i6Var.getParent();
                        w9Var.f6074k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) childAt;
                    if (b8Var.getPostInfo().b() == i11) {
                        w9Var.f6067a = b8Var.getImageView();
                        w9Var.f6076m = b8Var.getStoryAvatarParams();
                        w9Var.f6069c = b8Var.getImageView().getImageReceiver();
                        w9Var.f6071g = (View) b8Var.getParent();
                        w9Var.f6074k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i10) {
                        w9Var.f6067a = a5Var.getAvatarImageView();
                        w9Var.f6076m = a5Var.getStoryAvatarParams();
                        w9Var.f6068b = a5Var.getAvatarImageView().getImageReceiver();
                        w9Var.f6071g = (View) a5Var.getParent();
                        w9Var.f6074k = 1.0f;
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
        mm0 mm0Var = this.f5791a;
        if (mm0Var != null && (mm0Var.getParent() instanceof r)) {
            r rVar = (r) mm0Var.getParent();
            if (rVar.k(j10)) {
                rVar.f5814b0.add(s3Var);
                return;
            } else {
                s3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (mm0Var != null && (mm0Var.getParent() instanceof t5)) {
            t5 t5Var = (t5) mm0Var.getParent();
            yz yzVar = t5Var.f5961x;
            o5 o5Var = t5Var.f5960w;
            if (o5Var != null && (arrayList = o5Var.f5636c) != null && yzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        j5 j5Var = (j5) arrayList.get(i11);
                        if (j5Var != null) {
                            TL_stories.StoryReaction storyReaction = j5Var.f5471c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f20577id == i10) {
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
                        mm0Var.post(s3Var);
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
            NotificationCenter.getInstance(storiesController.f5399a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
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
        View view = w9Var.f6071g;
        if (view == null) {
            return;
        }
        if (view instanceof o7) {
            int[] iArr = this.f5793c;
            ((o7) view).a(iArr);
            w9Var.h = iArr[0];
            w9Var.f6072i = iArr[1] - this.f5797s;
        } else if (view instanceof org.telegram.ui.Components.ia) {
            w9Var.h = ((org.telegram.ui.Components.ia) view).Y2;
            w9Var.f6072i = (view.getMeasuredHeight() - w9Var.f6071g.getPaddingBottom()) - this.f5797s;
        } else {
            w9Var.h = view.getPaddingTop();
            w9Var.f6072i = (w9Var.f6071g.getMeasuredHeight() - w9Var.f6071g.getPaddingBottom()) - this.f5797s;
        }
    }

    public q7(wz0 wz0Var) {
        this.f5793c = new int[2];
        this.f5792b = wz0Var;
        this.f5791a = null;
    }
}
