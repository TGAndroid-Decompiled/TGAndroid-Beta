package bi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class r5 {
    public final int f3628a;
    public final ImageReceiver f3629b;
    public int f3630c;
    public boolean d;
    public float f3631e;
    public final org.telegram.ui.Components.e6 f3632f;
    public final org.telegram.ui.Components.e6 f3633g;
    public final org.telegram.ui.Components.e6 h;
    public float f3634i;
    public float f3635j;
    public float f3636k;
    public final boolean f3637l;
    public final RectF f3638m;
    public final RectF f3639n;

    public r5(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f3629b = imageReceiver;
        this.f3630c = 0;
        this.d = false;
        this.f3631e = 1.0f;
        pr prVar = pr.h;
        this.f3632f = new org.telegram.ui.Components.e6(profileStoriesView, 420L, prVar);
        this.f3633g = new org.telegram.ui.Components.e6(profileStoriesView, 420L, prVar);
        this.h = new org.telegram.ui.Components.e6(profileStoriesView, 420L, prVar);
        this.f3638m = new RectF();
        this.f3639n = new RectF();
        this.f3628a = storyItem.f20107id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f3637l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34169x) {
            imageReceiver.onAttachedToWindow();
        }
        o20[] o20VarArr = p9.f3510a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            i9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, i9Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
