package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m8 {
    public int f3321a;
    public String f3322b;
    public TLRPC.Photo f3323c;
    public TLRPC.Document d;

    public static m8 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f3321a = tL_storyAlbum.album_id;
        obj.f3322b = tL_storyAlbum.title;
        obj.f3323c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
