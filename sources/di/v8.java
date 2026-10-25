package di;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;
public abstract class v8 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new u8(storyItem).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(ic.a.i(readInt32, "(story) can't read params version = "));
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        u8 u8Var = new u8(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(u8Var.getObjectSize());
            u8Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
