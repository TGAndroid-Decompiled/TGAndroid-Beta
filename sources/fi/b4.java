package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class b4 {
    public final int f11765a;
    public final ImageReceiver f11766b;
    public int f11767c;
    public boolean d;
    public float f11768e;
    public final org.telegram.ui.Components.c6 f11769f;
    public final org.telegram.ui.Components.c6 f11770g;
    public final org.telegram.ui.Components.c6 h;
    public float f11771i;
    public float f11772j;
    public float f11773k;
    public final boolean f11774l;
    public final RectF f11775m;
    public final RectF f11776n;

    public b4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f11766b = imageReceiver;
        this.f11767c = 0;
        this.d = false;
        this.f11768e = 1.0f;
        lr lrVar = lr.h;
        this.f11769f = new org.telegram.ui.Components.c6(profileStoriesView, 420L, lrVar);
        this.f11770g = new org.telegram.ui.Components.c6(profileStoriesView, 420L, lrVar);
        this.h = new org.telegram.ui.Components.c6(profileStoriesView, 420L, lrVar);
        this.f11775m = new RectF();
        this.f11776n = new RectF();
        this.f11765a = storyItem.f28642id;
        imageReceiver.J0(org.telegram.messenger.g0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f11774l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f43826y) {
            imageReceiver.P();
        }
        p10[] p10VarArr = i7.f12112a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject g22 = mp.u1(imageReceiver.d).g2(storyItem.dialogId);
            b9Var.l(g22);
            imageReceiver.i0(g22, b9Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ec.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, fc.i(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ec.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
