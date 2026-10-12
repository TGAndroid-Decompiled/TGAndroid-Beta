package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;
public abstract class r1 {
    public static final Field f15551a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f15551a = field;
    }
}
