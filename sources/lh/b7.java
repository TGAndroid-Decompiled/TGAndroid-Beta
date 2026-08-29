package lh;

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
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.mz0;
public final class b7 implements e9 {
    public final jl0 f15401a;
    public final mz0 f15402b;
    public final int[] f15403c;
    public final boolean d;
    public a7 f15404e;
    public boolean f15405f;
    public boolean h;
    public boolean f15406n;
    public boolean f15407r;
    public int f15408s;

    public b7(jl0 jl0Var, boolean z10) {
        this.f15403c = new int[2];
        this.f15401a = jl0Var;
        this.d = z10;
        this.f15402b = null;
    }

    public static b7 a(jl0 jl0Var) {
        return new b7(jl0Var, false);
    }

    @Override
    public final boolean K0(long j10, int i10, int i11, int i12, f9 f9Var) {
        p pVar;
        ViewGroup viewGroup;
        boolean z10;
        c9 c9Var = null;
        f9Var.f15601a = null;
        f9Var.f15602b = null;
        f9Var.f15603c = null;
        f9Var.f15604e = null;
        jl0 jl0Var = this.f15401a;
        if (jl0Var != null && (jl0Var.getParent() instanceof p)) {
            pVar = (p) jl0Var.getParent();
        } else {
            pVar = null;
        }
        if (pVar != null && !pVar.g()) {
            viewGroup = pVar.f16064r;
        } else {
            viewGroup = jl0Var;
        }
        ViewGroup viewGroup2 = this.f15402b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof o) {
                    o oVar = (o) childAt;
                    if (oVar.A == j10) {
                        f9Var.f15601a = childAt;
                        f9Var.f15602b = oVar.f16001r;
                        f9Var.f15611m = oVar.K;
                        f9Var.d = oVar.N;
                        p pVar2 = (p) oVar.getParent().getParent();
                        f9Var.f15606g = pVar2;
                        f9Var.f15607i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.f15609k = 1.0f;
                        if (oVar.C && pVar2.g()) {
                            f9Var.f15605f = new l4.s0(new Path(), 6);
                            return true;
                        }
                        f9Var.f15605f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                    ImageReceiver imageReceiver = p2Var.U1;
                    org.telegram.ui.Cells.i2 i2Var = p2Var.f24906q0;
                    long dialogId = p2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j10 && !z11) || (z11 && p2Var.O())) {
                        f9Var.f15601a = childAt;
                        f9Var.f15611m = i2Var;
                        f9Var.f15602b = imageReceiver;
                        f9Var.f15606g = (View) p2Var.getParent();
                        if (z11) {
                            f9Var.f15610l = imageReceiver;
                            boolean z12 = i2Var.f15684w;
                        }
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject().getId() == i10) {
                        f9Var.f15601a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            f9Var.f15603c = s1Var.B9;
                        } else {
                            f9Var.f15603c = s1Var.getPhotoImage();
                        }
                        f9Var.f15606g = (View) s1Var.getParent();
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        f9Var.f15601a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            f9Var.f15602b = v0Var.getPhotoImage();
                        } else {
                            f9Var.f15603c = v0Var.getPhotoImage();
                        }
                        f9Var.f15606g = (View) v0Var.getParent();
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.p7) && jl0Var != null) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    MessageObject messageObject = p7Var.getMessageObject();
                    if ((p7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        sk0 fastScroll = jl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.f15601a = childAt;
                        f9Var.f15603c = p7Var.f24978c;
                        f9Var.f15604e = new androidx.car.app.utils.a(p7Var, fastScroll, iArr, 10);
                        f9Var.f15606g = (View) p7Var.getParent();
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof sa) {
                    sa saVar = (sa) childAt;
                    if (saVar.getDialogId() == j10) {
                        y3 y3Var = saVar.f25674a;
                        f9Var.f15601a = y3Var;
                        f9Var.f15611m = saVar.P;
                        f9Var.f15602b = y3Var.getImageReceiver();
                        f9Var.f15606g = (View) saVar.getParent();
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l6) {
                    org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                    t9 t9Var = l6Var.h;
                    if (l6Var.f24647x != j10) {
                        continue;
                    } else {
                        if (t9Var != null && t9Var.getImageReceiver() != null && t9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (l6Var.f24643n == i11 && z10) {
                            f9Var.f15601a = t9Var;
                            f9Var.f15603c = t9Var.getImageReceiver();
                            f9Var.f15606g = (View) l6Var.getParent();
                            float alphaInternal = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.f15609k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.f15608j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.k6 k6Var = l6Var.f24640c;
                            f9Var.f15601a = k6Var;
                            f9Var.f15611m = l6Var.f24648y;
                            f9Var.f15602b = k6Var.getImageReceiver();
                            f9Var.f15606g = (View) l6Var.getParent();
                            float alphaInternal2 = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.f15609k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.f15608j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (f6Var.getDialogId() == j10) {
                        f9Var.f15601a = f6Var;
                        f9Var.f15611m = f6Var.f24336q0;
                        f9Var.f15602b = f6Var.f24337r;
                        f9Var.f15606g = (View) f6Var.getParent();
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) childAt;
                    if (y7Var.getPostInfo().b() == i11) {
                        f9Var.f15601a = y7Var.getImageView();
                        f9Var.f15611m = y7Var.getStoryAvatarParams();
                        f9Var.f15603c = y7Var.getImageView().getImageReceiver();
                        f9Var.f15606g = (View) y7Var.getParent();
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.z4) {
                    org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) childAt;
                    if (z4Var.getStoryItem() != null && z4Var.getStoryItem().dialogId == j10 && z4Var.getStoryItem().messageId == i10) {
                        f9Var.f15601a = z4Var.getAvatarImageView();
                        f9Var.f15611m = z4Var.getStoryAvatarParams();
                        f9Var.f15602b = z4Var.getAvatarImageView().getImageReceiver();
                        f9Var.f15606g = (View) z4Var.getParent();
                        f9Var.f15609k = 1.0f;
                        b(f9Var);
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

    public final void b(f9 f9Var) {
        View view = f9Var.f15606g;
        if (view == null) {
            return;
        }
        if (view instanceof z6) {
            int[] iArr = this.f15403c;
            ((z6) view).a(iArr);
            f9Var.h = iArr[0];
            f9Var.f15607i = iArr[1] - this.f15408s;
        } else if (view instanceof fa) {
            f9Var.h = ((fa) view).T2;
            f9Var.f15607i = (view.getMeasuredHeight() - f9Var.f15606g.getPaddingBottom()) - this.f15408s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.f15607i = (f9Var.f15606g.getMeasuredHeight() - f9Var.f15606g.getPaddingBottom()) - this.f15408s;
        }
    }

    @Override
    public final void d(boolean z10) {
        a7 a7Var = this.f15404e;
        if (a7Var != null) {
            a7Var.d(z10);
        }
    }

    @Override
    public final void l1(long j10, int i10, j3 j3Var) {
        ArrayList arrayList;
        jl0 jl0Var = this.f15401a;
        if (jl0Var != null && (jl0Var.getParent() instanceof p)) {
            p pVar = (p) jl0Var.getParent();
            if (pVar.k(j10)) {
                pVar.U.add(j3Var);
                return;
            } else {
                j3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (jl0Var != null && (jl0Var.getParent() instanceof c5)) {
            c5 c5Var = (c5) jl0Var.getParent();
            kz kzVar = c5Var.f15441x;
            y4 y4Var = c5Var.f15440w;
            if (y4Var != null && (arrayList = y4Var.f16417c) != null && kzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        t4 t4Var = (t4) arrayList.get(i11);
                        if (t4Var != null) {
                            TL_stories.StoryReaction storyReaction = t4Var.f16263c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f22629id == i10) {
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
                    int L0 = kzVar.L0();
                    int N0 = kzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        kzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        jl0Var.post(j3Var);
                        return;
                    }
                }
            }
            j3Var.run();
            return;
        }
        if (this.d) {
            s6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f16218a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        j3Var.run();
    }

    public b7(mz0 mz0Var) {
        this.f15403c = new int[2];
        this.f15402b = mz0Var;
        this.f15401a = null;
    }
}
