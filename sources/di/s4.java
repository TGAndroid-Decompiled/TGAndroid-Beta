package di;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.z20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class s4 {
    public final int f9145a;
    public final ImageReceiver f9146b;
    public int f9147c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.h6 f9148f;
    public final org.telegram.ui.Components.h6 f9149g;
    public final org.telegram.ui.Components.h6 h;
    public float f9150i;
    public float f9151j;
    public float f9152k;
    public final boolean f9153l;
    public final RectF f9154m;
    public final RectF f9155n;

    public s4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f9146b = imageReceiver;
        this.f9147c = 0;
        this.d = false;
        this.e = 1.0f;
        ds dsVar = ds.h;
        this.f9148f = new org.telegram.ui.Components.h6(profileStoriesView, 420L, dsVar);
        this.f9149g = new org.telegram.ui.Components.h6(profileStoriesView, 420L, dsVar);
        this.h = new org.telegram.ui.Components.h6(profileStoriesView, 420L, dsVar);
        this.f9154m = new RectF();
        this.f9155n = new RectF();
        this.f9145a = storyItem.f22266id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f9153l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f36258x) {
            imageReceiver.onAttachedToWindow();
        }
        z20[] z20VarArr = a8.f8378a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            j9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, j9Var);
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
