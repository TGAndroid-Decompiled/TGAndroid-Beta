package me.vkryl.android.animator;

public interface Animatable {

    public abstract class CC {
        public static void $default$applyChanges(Animatable animatable) {
        }

        public static boolean $default$hasChanges(Animatable animatable) {
            return false;
        }

        public static void $default$prepareChanges(Animatable animatable) {
        }
    }

    boolean applyAnimation(float f);

    void applyChanges();

    void finishAnimation(boolean z);

    boolean hasChanges();

    void prepareChanges();
}
