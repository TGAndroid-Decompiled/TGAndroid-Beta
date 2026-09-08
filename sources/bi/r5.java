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
    public final int f3655a;
    public final ImageReceiver f3656b;
    public int f3657c;
    public boolean d;
    public float f3658e;
    public final org.telegram.ui.Components.e6 f3659f;
    public final org.telegram.ui.Components.e6 f3660g;
    public final org.telegram.ui.Components.e6 h;
    public float f3661i;
    public float f3662j;
    public float f3663k;
    public final boolean f3664l;
    public final RectF f3665m;
    public final RectF f3666n;

    public r5(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f3656b = imageReceiver;
        this.f3657c = 0;
        this.d = false;
        this.f3658e = 1.0f;
        pr prVar = pr.h;
        this.f3659f = new org.telegram.ui.Components.e6(profileStoriesView, 420L, prVar);
        this.f3660g = new org.telegram.ui.Components.e6(profileStoriesView, 420L, prVar);
        this.h = new org.telegram.ui.Components.e6(profileStoriesView, 420L, prVar);
        this.f3665m = new RectF();
        this.f3666n = new RectF();
        this.f3655a = storyItem.f20134id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f3664l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34196x) {
            imageReceiver.onAttachedToWindow();
        }
        o20[] o20VarArr = p9.f3537a;
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
