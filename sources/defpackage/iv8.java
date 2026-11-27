package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class iv8 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final mm f;
    public final mm g;
    public final mm h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public iv8(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        rb0 rb0Var = new rb0((vnb) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        k43 k43Var = k43.h;
        this.f = new mm(420L, profileStoriesView, k43Var);
        this.g = new mm(420L, profileStoriesView, k43Var);
        this.h = new mm(420L, profileStoriesView, k43Var);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.q0(hl.L(200.0f));
        imageReceiver.p0(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.y) {
            imageReceiver.I();
        }
        o15[] o15VarArr = t6b.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject b2 = uc7.s1(imageReceiver.d).b2(storyItem.dialogId);
            rb0Var.k(b2);
            imageReceiver.U(b2, rb0Var, null);
            return;
        }
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                imageReceiver.Z(jn5.c(xb4.w(document.thumbs, hl.L(25.0f), false, null, true), storyItem.media.document), "25_25", null, null, in5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            photo = messageMedia.photo;
        } else {
            photo = null;
        }
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.Y(null, null, jn5.i(xb4.w(arrayList, hl.L(25.0f), false, null, true), photo), "25_25", null, null, in5.i(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
